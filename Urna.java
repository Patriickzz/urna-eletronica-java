import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] votosSenador = new int[2];
        int[] votosPresidente = new int[1];

        int[] votosValidosSenador = {150, 500, 444, 405, 135, 456, 290, 131, 210, 510, 111, 251};
        int[] votosValidosPresidente = {17, 13, 12, 50, 51, 18, 45, 19, 15, 30};
        
        int totalVotos = 0, totalNulos = 0, totalBrancos = 0;

        int[] votosCandidatosSenado = new int[1000];
        int[] votosCandidatosPresidente = new int[1000];

        System.out.println("Seja bem-vindo(a) à urna de eleições!");
        System.out.println("Veja as opções de candidatos a seguir:\n");

        Urnafuncoes.mostrarSenadores();

        for (int i = 0; i < 2; i++) {
            int votoAtual;
            do {
                System.out.printf("\nSelecione o %dº candidato ao SENADO: ", i + 1);
                votoAtual = entrada.nextInt();

                if(i == 1 && votosSenador[0] == votoAtual){
                    System.out.println("\nOpção inválida! Você não pode votar duas vezes no mesmo candidato.");
                    System.out.println("Tente novamente, por favor!");
                }
            } while (i == 1 && votosSenador[0] == votoAtual);

            votosSenador[i] = votoAtual;
            totalVotos++;
            
            int j;
            for(j = 0; j < 12; j++){
                if(votoAtual == votosValidosSenador[j]){
                    break;
                }
            }
            if(j == 12){
                totalNulos++;
            }else if(votoAtual == 1){
                totalBrancos++;
            }else{
                votosCandidatosSenado[votoAtual]++;
            }    
            System.out.print("\nSeu voto foi: ");
            Urnafuncoes.mostrarVotoSenador(votoAtual);
        }

        System.out.println("\nAgora, escolha uma opção entre os candidatos à PRESIDÊNCIA:\n");
        Urnafuncoes.mostrarPresidentes();

        for (int i = 0; i < 1; i++) {
            System.out.printf("\nSelecione o candidato à PRESIDÊNCIA: ");
            int votoAtual = entrada.nextInt();

            votosPresidente[i] = votoAtual;
            totalVotos++;

            int k;
            for(k = 0; k < 10; k++){
                if(votoAtual == votosValidosPresidente[k]){
                    break;
                }
            }
            if(k == 10){
                totalNulos++;
            }else if(votoAtual == 1){
                totalBrancos++;
            }else{
                votosCandidatosPresidente[votoAtual]++;
            }
            System.out.print("\nSeu voto foi: ");
            Urnafuncoes.mostrarVotoPresidente(votoAtual);
        }

        Urnafuncoes.limparTela();

        System.out.println("\n--- RESULTADOS FINAIS ---");
        System.out.println("\nTOTAL DE VOTOS: " + totalVotos);
        System.out.println("TOTAL DE VOTOS NULOS: " + totalNulos);
        System.out.println("TOTAL DE VOTOS EM BRANCO: " + totalBrancos);

        int votosValidos = totalVotos - totalNulos - totalBrancos;

        if(votosValidos > 0){
            double percentualNulos = ((double) totalNulos / totalVotos) * 100;
            double percentualBrancos = ((double) totalBrancos / totalVotos) * 100;

            System.out.printf("PERCENTUAL DE VOTOS NULOS: %.2f%%\n", percentualNulos);
            System.out.printf("PERCENTUAL DE VOTOS EM BRANCO: %.2f%%\n", percentualBrancos);
        }else{
            System.out.println("Não houve votos válidos para calcular percentuais.");
        }

        entrada.close();
    }
}
