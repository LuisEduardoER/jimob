package br.fatecpg.usuario;

public class BeanUsuario {

    private int cd_usuario;
    private String nm_login;
    private String nm_senha;
    private String cd_nivel;
    private String dt_cadastro;

    /**
     * @return the cd_usuario
     */
    public int getCd_usuario() {
        return cd_usuario;
    }

    /**
     * @param cd_usuario the cd_usuario to set
     */
    public void setCd_usuario(int cd_usuario) {
        this.cd_usuario = cd_usuario;
    }

    /**
     * @return the nm_login
     */
    public String getNm_login() {
        return nm_login;
    }

    /**
     * @param nm_login the nm_login to set
     */
    public void setNm_login(String nm_login) {
        this.nm_login = nm_login;
    }

    /**
     * @return the nm_senha
     */
    public String getNm_senha() {
        return nm_senha;
    }

    /**
     * @param nm_senha the nm_senha to set
     */
    public void setNm_senha(String nm_senha) {
        this.nm_senha = nm_senha;
    }

    /**
     * @return the cd_nivel
     */
    public String getCd_nivel() {
        return cd_nivel;
    }

    /**
     * @param cd_nivel the cd_nivel to set
     */
    public void setCd_nivel(String cd_nivel) {
        this.cd_nivel = cd_nivel;
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
