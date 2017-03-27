package software_design.adapter.tabajara;

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
