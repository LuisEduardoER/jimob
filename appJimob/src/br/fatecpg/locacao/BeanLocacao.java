

package br.fatecpg.locacao;


public class BeanLocacao {

    private int cd_locacao;
    private int cd_imovel;
    private int cd_locatario;
    private int cd_corretor;
    private int cd_numero_contrato;
    private String dt_inicio_contrato;
    private String dt_termino_contrato;
    private double vl_locacao;
    private double pc_multa_atraso;
    private double pc_rescisao_contrato;
    private  String dt_cadastro;

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
     * @return the cd_numero_contrato
     */
    public int getCd_numero_contrato() {
        return cd_numero_contrato;
    }

    /**
     * @param cd_numero_contrato the cd_numero_contrato to set
     */
    public void setCd_numero_contrato(int cd_numero_contrato) {
        this.cd_numero_contrato = cd_numero_contrato;
    }

    /**
     * @return the dt_inicio_contrato
     */
    public String getDt_inicio_contrato() {
        return dt_inicio_contrato;
    }

    /**
     * @param dt_inicio_contrato the dt_inicio_contrato to set
     */
    public void setDt_inicio_contrato(String dt_inicio_contrato) {
        this.dt_inicio_contrato = dt_inicio_contrato;
    }

    /**
     * @return the dt_termino_contrato
     */
    public String getDt_termino_contrato() {
        return dt_termino_contrato;
    }

    /**
     * @param dt_termino_contrato the dt_termino_contrato to set
     */
    public void setDt_termino_contrato(String dt_termino_contrato) {
        this.dt_termino_contrato = dt_termino_contrato;
    }

    /**
     * @return the vl_locacao
     */
    public double getVl_locacao() {
        return vl_locacao;
    }

    /**
     * @param vl_locacao the vl_locacao to set
     */
    public void setVl_locacao(double vl_locacao) {
        this.vl_locacao = vl_locacao;
    }

    /**
     * @return the pc_multa_atraso
     */
    public double getPc_multa_atraso() {
        return pc_multa_atraso;
    }

    /**
     * @param pc_multa_atraso the pc_multa_atraso to set
     */
    public void setPc_multa_atraso(double pc_multa_atraso) {
        this.pc_multa_atraso = pc_multa_atraso;
    }

    /**
     * @return the pc_rescisao_contrato
     */
    public double getPc_rescisao_contrato() {
        return pc_rescisao_contrato;
    }

    /**
     * @param pc_rescisao_contrato the pc_rescisao_contrato to set
     */
    public void setPc_rescisao_contrato(double pc_rescisao_contrato) {
        this.pc_rescisao_contrato = pc_rescisao_contrato;
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
