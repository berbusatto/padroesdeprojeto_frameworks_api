
    public class ProxyMensagem implements Mensagem {

        MensagemReal msg = new MensagemReal();
        //precisa do objeto real para acessar pelo proxy;


        public void mostraMensagem() {

            System.out.println("Proxy executa algo ANTES de MensagemReal");
            msg.mostraMensagem();
            System.out.println("Proxy executa algo APOS de MensagemReal");

        }

    }

