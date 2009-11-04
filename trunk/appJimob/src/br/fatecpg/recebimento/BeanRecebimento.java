package br.fatecpg.recebimento;

public class BeanRecebimento {

    private int cd_recebimento;
    private int cd_corretor;
    private int cd_locatario;
    private int cd_imovel;
    private int cd_locacao;
    private double vl_rebebimento;
    private String dt_recebimento;
    private double vl_multa_gerada;

    /**
     * @return the cd_recebimento
     */
    public int getCd_recebimento() {
        return cd_recebimento;
    }

    /**
     * @param cd_recebimento the cd_recebimento to set
     */
    public void setCd_recebimento(int cd_recebimento) {
        this.cd_recebimento = cd_recebimento;
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
     * @return the cd_locatario
     */
    public int getCd_locatario() {
        return cd_locatario;
    }

    /**
     * @param cd_locatario the cd_locatario to set
     */
    public void setCd_locatario(int cd_locatario) {
        this.cd_locatario = cd_locatario;
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
     * @return the cd_locacao
     */
    public int getCd_locacao() {
        return cd_locacao;
    }

    /**
     * @param cd_locacao the cd_locacao to set
     */
    public void setCd_locacao(int cd_locacao) {
        this.cd_locacao = cd_locacao;
    }

    /**
     * @return the vl_rebebimento
     */
    public double getVl_rebebimento() {
        return vl_rebebimento;
    }

    /**
     * @param vl_rebebimento the vl_rebebimento to set
     */
    public void setVl_rebebimento(double vl_rebebimento) {
        this.vl_rebebimento = vl_rebebimento;
    }

    /**
     * @return the dt_recebimento
     */
    public String getDt_recebimento() {
        return dt_recebimento;
    }

    /**
     * @param dt_recebimento the dt_recebimento to set
     */
    public void setDt_recebimento(String dt_recebimento) {
        this.dt_recebimento = dt_recebimento;
    }

    /**
     * @return the vl_multa_gerada
     */
    public double getVl_multa_gerada() {
        return vl_multa_gerada;
    }

    /**
     * @param vl_multa_gerada the vl_multa_gerada to set
     */
    public void setVl_multa_gerada(double vl_multa_gerada) {
        this.vl_multa_gerada = vl_multa_gerada;
    }
}
