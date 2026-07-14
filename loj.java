import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("all")
public class loj {
    static String arroz = "arroz";
    static String feijao = "feijão";
    static String macarrao = "macarrão";
    static String carne = "carne";
    static String frango = "frango";
    static String peixe = "peixe";
    static String leite = "leite";
    static String ovos = "ovos";
    static String pao = "pão";
    static String queijo = "queijo";
    static String manteiga = "manteiga";
    static String wagyu = "carne Wagyu";
    static ArrayList<String> mercado = new ArrayList<String>();
    static int mercadoria;
    static int dinheiro = 10;
    static int chance = 100;
    static Compras mercad = new Compras();
    static Scanner sc = new Scanner(System.in);
    static Produtos prod = new Produtos();
    static Random rand = new Random();
    static Mercado loja = new Mercado();

    public static class Mercado {
        static String[] cliente = {"joão", "joaquim", "pedro", "clara", "cardoso", "antônio", "lucas", "alexandre"};

        void abrir_mercado(String merad) {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("erero bora bill");
                }

                if (rand.nextInt(100) <= 40) {
                    if (mercado.isEmpty()) {
                        System.out.println("não há produtos para vender no momento");
                        break;
                    }

                    int indsort = rand.nextInt(mercado.size());
                    String produto = mercado.get(indsort);
                    int preco = 0;

                    System.out.println("um cliente chamado " + cliente[rand.nextInt(cliente.length)] + " entrou no mercado");
                    System.out.println();
                    System.out.println("o cliente chegou no caixa com o seguinte produto: " + produto);
                    System.out.println("defina um preço ao produto");
                    String preco_str = sc.nextLine();
                    try {
                        preco = Integer.parseInt(preco_str);
                    } catch (NumberFormatException e) {
                        System.out.println("valor inválido, tente novamente");
                        continue;
                    }

                    if (preco <= 0 || preco > 10000) {
                        System.out.println("valor inválido, tente novamente");
                        continue;
                    }

                    if (indsort >= 0 && indsort < mercado.size()) {
                        mercado.remove(indsort);
                        dinheiro += preco;
                        mercadoria--;
                        System.out.println("você vendeu o produto " + produto + " por " + preco + "$");
                    } else {
                        System.out.println("produto não encontrado tente novamente");
                    }

                    if (rand.nextInt(100) <= 32) {
                        System.out.println("por enquanto nada...");
                    }

                    if (rand.nextInt(100) <= 28) {
                        if (!mercado.isEmpty()) {
                            System.out.println("um ladrão roubou você ele pegou " + produto + " e fugiu com ele \n");
                            System.out.println("deseja correr atrás dele? (1) = sim ,(2) = não \n");
                            String correr = sc.nextLine();
                            if (correr.equalsIgnoreCase("1")) {
                                if (rand.nextInt(100) <= 50) {
                                    System.out.println("você pegou o ladrão e recuperou o produto " + produto + " e ainda ganhou 10$ de recompensa \n");
                                    dinheiro += 10;
                                    System.out.println("tá ricão loco");
                                }
                                if (rand.nextInt(100) <=50){
                                    System.out.println("você perdeu o produto para o ladrão");
                                    mercado.remove(produto);
                                }
                            }
                            if (correr.equalsIgnoreCase("2")){
                                System.out.println("ele roubou o produto");
                                mercado.remove(produto);
                            }
                        }
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("erero bora bill");
                }
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("bem vindo ao mercado do jão suas mercadorias ate agora são: " + mercadoria + " mercadorias, e você tem essa quantidade de dinheiro: " + dinheiro + "$\n");
            System.out.println("deseja comprar algo (1) = sim ,(2) = não, (3) = ver produtos, (4) = sair, (5) abrir mercado \n");
            String comprar = sc.nextLine();

            if (comprar.equalsIgnoreCase("1")) {
                System.out.println("caminhando até a loja");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("erero bora bill");
                }
                mercad.produtos_venda(null);
                break;
            } else if (comprar.equalsIgnoreCase("2")) {
                System.out.println("continuando...");
            } else if (comprar.equalsIgnoreCase("3")) {
                System.out.println("executando silaba 123...");
                for (int i = 0; i < 3; i++) {
                    System.out.println(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                    System.out.println("..");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                    System.out.println("...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                }
                prod.ver_produtos(null);
            } else if (comprar.equalsIgnoreCase("4")) {
                System.out.println("saindo...");
                for (int i = 0; i < 1; i++) {
                    System.out.println(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                    System.out.println("..");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                    System.out.println("...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                }
                break;
            } else if (comprar.equalsIgnoreCase("5")) {
                System.out.println("abrindo mercado...");
                for (int i = 0; i < 1; i++) {
                    System.out.println(".");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                    System.out.println("..");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                    System.out.println("...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                }
                loja.abrir_mercado(null);
            } else {
                System.out.println("digite (1) (2) (3) ou (4) para sair");
                continue;
            }
        }
    }

    public static class Produtos {
        void ver_produtos(String produtos) {
            System.out.println(mercado);
        }
    }

    public static class Compras {
        void produtos_venda(String produto) {
            while (true) {
                if (dinheiro <= 0) {
                    System.out.println("você não tem dinheiro suficiente para comprar nada, volte quando tiver dinheiro");
                    loj.main(null);
                }

                System.out.println("produtos a venda: \n");
                System.out.println("1 - arroz, 5$, kg \n");
                System.out.println("2 - feijão, 3$, kg \n");
                System.out.println("3 - macarrão, 6$, 100g \n");
                System.out.println("4 - carne, 25$, kg \n");
                System.out.println("5 - frango, 16$, kg \n");
                System.out.println("6 - peixe, 15$, kg \n");
                System.out.println("7 - leite, 5$ \n");
                System.out.println("8 - ovos, 10$, 20 unidades \n");
                System.out.println("9 - pão, 20$, 30 unidades \n");
                System.out.println("10 - queijo, 3$ \n");
                System.out.println("11 - manteiga, 4$ \n");
                System.out.println("12 - carne Wagyu, 400$ , kg \n");
                System.out.println();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("erero bora bill");
                }

                System.out.println("deseja comprar qual? digite o numero do produto \n");
                System.out.println("ou deseja cancelar a comprar digite (0) \n");
                String deseja = sc.nextLine();

                if (deseja.equalsIgnoreCase("0")) {
                    System.out.println("compra cancelada");
                    loj.main(null);
                } else if (deseja.equalsIgnoreCase("1")) {
                    if (dinheiro < 5) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 5;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.arroz);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("2")) {
                    if (dinheiro < 3) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 3;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.feijao);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("3")) {
                    if (dinheiro < 6) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 6;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.macarrao);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("4")) {
                    if (dinheiro < 25) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 25;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.carne);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("5")) {
                    if (dinheiro < 16) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 16;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.frango);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("6")) {
                    if (dinheiro < 15) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 15;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.peixe);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("7")) {
                    if (dinheiro < 5) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 5;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.leite);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("8")) {
                    if (dinheiro < 10) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 10;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.ovos);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("9")) {
                    if (dinheiro < 20) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 20;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.pao);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("10")) {
                    if (dinheiro < 3) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 3;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.queijo);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("11")) {
                    if (dinheiro < 4) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 4;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.manteiga);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else if (deseja.equalsIgnoreCase("12")) {
                    if (dinheiro < 400) {
                        System.out.println("você não tem dinheiro suficiente para comprar esse produto, volte quando tiver dinheiro");
                        loj.main(null);
                    }
                    mercadoria++;
                    dinheiro -= 400;
                    System.out.println("compra realizada com sucesso! \n");
                    loj.mercado.add(loj.wagyu);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.err.println("erero bora bill");
                    }
                } else {
                    System.out.println("produto não encontrado, tente novamente");
                    continue;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("erero bora bill");
                }
            }
        }
    }
}
