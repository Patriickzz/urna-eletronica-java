public class Urnafuncoes {
    public static void mostrarSenadores() {
        System.out.println("/// SENADOR ///");
        System.out.println("Agenor (MDB) - 150");
        System.out.println("Fabrício Rosa (PSOL) - 500");
        System.out.println("Jorge Kajuru (PRP) - 444");
        System.out.println("Lúcia Vânia (PSB) - 405");
        System.out.println("Luis César Bueno (PT) - 135");
        System.out.println("Marconi Perillo (PSDB) - 456");
        System.out.println("Professor Alessandro Aquino (PCO) - 290");
        System.out.println("Professora Geli (PT) - 131");
        System.out.println("Professora Magda Borges (PCB) - 210");
        System.out.println("Santana Pires (Patriota) - 510");
        System.out.println("Vanderlan (PP) - 111");
        System.out.println("Wilder Morais (DEM) - 251");
        System.out.println("Voto EM BRANCO - 1");
    }

    public static void mostrarPresidentes() {
        System.out.println("/// PRESIDENTE ///");
        System.out.println("Bolsonaro - 17");
        System.out.println("Haddad - 13");
        System.out.println("Ciro - 12");
        System.out.println("Boulos - 50");
        System.out.println("Cabo Daciolo - 51");
        System.out.println("Marina Silva - 18");
        System.out.println("Geraldo Alckmin - 45");
        System.out.println("Álvaro Dias - 61");
        System.out.println("Henrique Meirelles - 15");
        System.out.println("João Amoedo - 30");
        System.out.println("Voto EM BRANCO - 1");
    }

    public static void mostrarVotoSenador(int voto) {
        switch (voto) {
            case 150: System.out.println("Agenor"); break;
            case 500: System.out.println("Fabrício Rosa"); break;
            case 444: System.out.println("Jorge Kajuru"); break;
            case 405: System.out.println("Lúcia Vânia"); break;
            case 135: System.out.println("Luis César Bueno"); break;
            case 456: System.out.println("Marconi Perillo"); break;
            case 290: System.out.println("Professor Alessandro Aquino"); break;
            case 131: System.out.println("Professora Geli"); break;
            case 210: System.out.println("Professora Magda Borges"); break;
            case 510: System.out.println("Santana Pires"); break;
            case 111: System.out.println("Vanderlan"); break;
            case 251: System.out.println("Wilder Morais"); break;
            case 1: System.out.println("Voto EM BRANCO"); break;
            default: System.out.println("Número inválido!");
        }
    }

    public static void mostrarVotoPresidente(int voto) {
        switch (voto) {
            case 17: System.out.println("Bolsonaro"); break;
            case 13: System.out.println("Haddad"); break;
            case 12: System.out.println("Ciro"); break;
            case 50: System.out.println("Boulos"); break;
            case 51: System.out.println("Cabo Daciolo"); break;
            case 18: System.out.println("Marina Silva"); break;
            case 45: System.out.println("Geraldo Alckmin"); break;
            case 61: System.out.println("Álvaro Dias"); break;
            case 15: System.out.println("Henrique Meirelles"); break;
            case 30: System.out.println("João Amoedo"); break;
            case 1: System.out.println("Voto EM BRANCO"); break;
            default: System.out.println("Número inválido!");
        }
    }

    public static void limparTela() {
        for (int i = 0; i < 10; i++) System.out.println();
    }
}
