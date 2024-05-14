package Lab01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sopa {
    private List<List<Character>> puzzleCharacters; 
    private Set<String> words; 


    public Sopa (List<String> fileLines){
        this.words = new HashSet<>();
        loadPuzzle(fileLines); // Carrega a sopa de letras e as palavras 
        loadWords(fileLines);
    }

    // Método para carregar a sopa de letras 
    private void loadPuzzle (List<String> fileLines){
        // Verificar se o puzzle é quadrado 
        int puzzleSize = fileLines.size() -1; 
        for (String line : fileLines.subList(0, puzzleSize)){
            if (line.length() != puzzleSize){
                throw new IllegalArgumentException("O puzzle não é quadrado"); 
            }
        }

        // Verificar que não excede 40x40 
        if (puzzleSize > 40){
            throw new IllegalArgumentException("O puzzle execede os 40x40"); 
        } 

        //Verificar se todas as letras estão em maiusculas 
        for (String line : fileLines.subList(0, puzzleSize)){
            for (char c : line.toCharArray()){
                if (!Character.isUpperCase(c)){
                    throw new IllegalArgumentException("Puzzle contém letras que não estão em maiúsculas");
                }
            }
        }

        // Verificar se há linhas vazias no puzzle
        for (String line : fileLines.subList(0,puzzleSize)){
            if (line.trim().isEmpty()){
                throw new IllegalArgumentException("O puzzle não pode ter linhas vazias");
            }
        }

        // nova lista vazia 
        this.puzzleCharacters = new ArrayList<>();
        // obtém todas as linhas do arquivo, excepto a ultima (pq contém as palavras)
        for (String line : fileLines.subList(0, fileLines.size() -1)){
            // para cada linha na sopa de letras, é criado uma lista de caracteres 'row' vazia 
            List<Character> row = new ArrayList<>();
            for (char c : line.toCharArray()){
                row.add(c); // adiciona o caracter à lista 'row'
            }
            // depois de todos serem adicionados a lista 'row' é adicionado à lista 'puzzleCharacteres', representando uma linha completa na sopa de letras
            puzzleCharacters.add(row); 
        }
    }

    private void loadWords (List<String> fileLines){
        // obtém a ultima linha do arquivo e divide essa linha em palavras individuais 
        // e cria um array (wordLines) onde cada elemento dele é uma palavra 
        String[] wordLines = fileLines.get(fileLines.size()-1).split("[,; ]");
        // itera sobre cada palavra do array 
        for (String word : wordLines){
            // Verificar se há linhas vazias na lista de palavras
            if (word.trim().isEmpty()){
                throw new IllegalArgumentException("A lista de palavras não pode conter linhas vazias");
            } else {
                // Converter a palavra para maiúsculas e adiciona ao conjunto 
                word = word.trim().toUpperCase(); 
                if (isValidWord(word)){
                    words.add(word);
                }
            }
        }
    }

    private boolean isValidWord(String word) {
        return word.matches("[a-zA-Z]+") && word.length() >= 3; 
    }

    public List<Solution> solvePuzzle(){
        // Criação de uma lista vazia para armazenar as soluções 
        List <Solution> solutions = new ArrayList<>(); 
        
        // Verificar se todas as palavras da lista aparecem no puzzle, e aparecem apenas uma vez
        for (String word : words){
            int appears = 0; 
            for (int row = 0; row < puzzleCharacters.size(); row++){
                for (int col = 0; col < puzzleCharacters.get(row).size(); col++){
                    for (String direction : Solution.DIRECTIONS){
                        // método search usado para percorrer o puzzle e contar o nº vezes que aparece cada palavra no puzzle 
                        Solution solution = search(word, row, col, direction); 
                        if (solution != null){
                            appears++; 
                        }
                    }
                }
            }
            if (appears == 0){
                throw new IllegalStateException("A palavra" +word+ "não está presente"); 
            } else if (appears > 1){
                throw new IllegalStateException("A palavra" +word+ "é repetida");
            }
        }
    

        // Resolver o puzzle e retonar as suas soluções
        for (String word : words) {
            // para cada palavra word na lista words, é adicionada à lista solutions
            // método findWord vai 
            solutions.addAll(findWord(word)); 
        }
        return solutions; 
    }

    // Para uma palavra específica 
    private List <Solution> findWord(String word){
        List <Solution> wordSolutions = new ArrayList<>(); 
        for (int row = 0; row < puzzleCharacters.size(); row++){
            for(int col = 0; col < puzzleCharacters.get(row).size(); col++){
                for (String direction : Solution.DIRECTIONS){
                    Solution solution = search(word, row, col, direction); 
                    if (solution != null){
                        wordSolutions.add(solution); 
                    }
                }
            }
        }
        return wordSolutions; 
    }

    // Procurar por uma palavra numa posição específica e numa direção específica
    private Solution search(String word, int row, int col, String direction){
        StringBuilder foundWord = new StringBuilder(); 
        int length = word.length(); 
        int d_row = Solution.DIRECTIONS_PUZZLE.get(direction)[0]; 
        int d_col = Solution.DIRECTIONS_PUZZLE.get(direction)[1]; 
        int newRow = row; 
        int newCol = col; 
        // Verifica se está dentro dos limites 
        for (int i = 0; i< length; i++){
            if (newRow < 0 || newRow >= puzzleCharacters.size() || newCol < 0 || newCol >= puzzleCharacters.get(newRow).size()){
                return null; 
            }
            // Obtem o caracter do quebra-cabeças na posição atual
            char puzzleChar = puzzleCharacters.get(newRow).get(newCol); 
            // Verifica se o caracter da sopa de letras coincide com o caracter da palavra
            if (puzzleChar != word.charAt(i)){
                return null;
            }
            foundWord.append(puzzleChar); 
            newRow += d_row;
            newCol += d_col;  
        }
        return new Solution(new int[] {row + 1, col + 1}, foundWord.toString(), direction); 
    }

    public String Results(){
        StringBuilder result = new StringBuilder();

        List <Solution> solutions = solvePuzzle(); 

        // Para adicionar as soluções bem formatadas
        for (Solution solution : solutions){
            result.append(String.format("%-15s %-7d %d, %-7d %s\n",
                solution.getWord().toUpperCase(), solution.getWord().length(),
                solution.getstartingCoordinates()[0], solution.getstartingCoordinates()[1],
                solution.getDirection()));
        }
        return result.toString();
    }
}














