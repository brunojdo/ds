package software_design.decorator.tabajara;

class CabecalhoGif implements Cabecalho {

    @Override
    public short altura() {
        return 256;
    }

    @Override
    public short largura() {
        return 256;
    }
}
