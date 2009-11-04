package br.fatecpg.venda;

public class BeanVenda {

    private int cd_venda;
    private int cd_imovel;
    private int cd_comprador;
    private int cd_corretor;
    private String dt_venda;
    private double vl_venda;
    private String dt_cadastro;

    /**
     * @return the cd_venda
     */
    public int getCd_venda() {
        return cd_venda;
    }

    /**
     * @param cd_venda the cd_venda to set
     */
    public void setCd_venda(int cd_venda) {
        this.cd_venda = cd_venda;
    }

    /**
     * @return the cd_imovel
     */
    public int getCd_imovel() {
        return cd_imovel;
    }

    /**
     * @param cd_imovel the cd_imovel to set
     */
    public void setCd_imovel(int cd_imovel) {
        this.cd_imovel = cd_imovel;
    }

    /**
     * @return the cd_comprador
     */
    public int getCd_comprador() {
        return cd_comprador;
    }

    /**
     * @param cd_comprador the cd_comprador to set
     */
    public void setCd_comprador(int cd_comprador) {
        this.cd_comprador = cd_comprador;
    }

    /**
     * @return the cd_corretor
     */
    public int getCd_corretor() {
        return cd_corretor;
    }

    /**
     * @param cd_corretor the cd_corretor to set
     */
    public void setCd_corretor(int cd_corretor) {
        this.cd_corretor = cd_corretor;
    }

    /**
     * @return the dt_venda
     */
    public String getDt_venda() {
        return dt_venda;
    }

    /**
     * @param dt_venda the dt_venda to set
     */
    public void setDt_venda(String dt_venda) {
        this.dt_venda = dt_venda;
    }

    /**
     * @return the vl_venda
     */
    public double getVl_venda() {
        return vl_venda;
    }

    /**
     * @param vl_venda the vl_venda to set
     */
    public void setVl_venda(double vl_venda) {
        this.vl_venda = vl_venda;
    }

    /**
     * @return the dt_cadastro
     */
    public String getDt_cadastro() {
        return dt_cadastro;
    }

    /**
     * @param dt_cadastro the dt_cadastro to set
     */
    public void setDt_cadastro(String dt_cadastro) {
        this.dt_cadastro = dt_cadastro;
    }
}
