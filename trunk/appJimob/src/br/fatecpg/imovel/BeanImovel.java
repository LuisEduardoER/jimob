package br.fatecpg.imovel;

public class BeanImovel {

    private int cd_imovel;
    private int cd_proprietario;
    private String nm_tipo_imovel;
    private String nm_finalidade;
    private String nm_negocio;
    private String nm_local_chaves;
    private String nm_tipo_logradouro;
    private String nm_logradouro;
    private String qt_numero_logradouro;
    private String nm_complemento_endereco;
    private String nm_bairro;
    private String nm_cidade;
    private String sg_unidade_federativa;
    private String ds_referencia_localizacao;
    private double qt_area_terreno;
    private double qt_area_construida;
    private double qt_area_total;
    private double qt_area_util;
    private double qt_area_privada;
    private double qt_area_comum;
    private String nm_situacao;
    private char ic_mobiliado;
    private int qt_idade;
    private char ic_enchente;
    private int qt_apartamento_andar;
    private int qt_elevador;
    private String qt_topografia_terreno;
    private String ds_documentacao;
    private int qt_dormitorio;
    private char ic_armario_dormitorio;
    private String nm_tipo_piso_dormitorio;
    private char ic_varanda_dormitorio;
    private char ic_sacada_dormitorio;
    private int qt_suite;
    private char ic_armario_suite;
    private String nm_tipo_piso_suite;
    private char ic_closet_suite;
    private char ic_hidromassagem_suite;
    private char ic_varanda_suite;
    private char ic_sacada_suite;
    private int qt_sala;
    private int qt_ambiente_sala;
    private String nm_tipo_piso_sala;
    private char ic_lareira_sala;
    private char ic_bar_sala;
    private char ic_sacada_sala;
    private int qt_cozinha;
    private char ic_copa_cozinha;
    private char ic_planejada_cozinha;
    private char ic_armario_cozinha;
    private String nm_tipo_piso_cozinha;
    private String nm_tipo_pia_cozinha;
    private char ic_despensa_cozinha;
    private int qt_banheiro;
    private char ic_gabinete_banheiro;
    private char ic_box_banheiro;
    private String nm_tipo_box_banheiro;
    private String nm_tipo_piso_banheiro;
    private int qt_lavabo_banheiro;
    private int qt_escritorio;
    private String nm_tipo_piso_escritorio;
    private char ic_dependencia_empregada;
    private char ic_lavanderia;
    private char ic_edicula;
    private char ic_quintal;
    private char ic_jardim;
    private char ic_garagem;
    private int qt_vaga_garagem;
    private char ic_vaga_coberta;
    private char ic_sauna;
    private char ic_piscina;
    private char ic_playground;
    private char ic_quadra_poliesportiva;
    private char ic_quadra_tenis;
    private char ic_sala_ginastica;
    private char ic_salao_festas;
    private char ic_sala_jogos;
    private char ic_churrasqueira;
    private char ic_forno_pizza;
    private char ic_tv_cabo;
    private char ic_internet;
    private char ic_canil;
    private char ic_seguranca_patrimonial;
    private char ic_condominio_fechado;
    private double vl_venda;
    private double vl_locacao_comercial;
    private double vl_locacao_residencial;
    private double vl_locacao_temporada;
    private double vl_iptu;
    private String cd_iptu_cadastro;
    private double vl_condominio;
    private String ds_imovel;
    private String dt_cadastro;

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
     * @return the cd_proprietario
     */
    public int getCd_proprietario() {
        return cd_proprietario;
    }

    /**
     * @param cd_proprietario the cd_proprietario to set
     */
    public void setCd_proprietario(int cd_proprietario) {
        this.cd_proprietario = cd_proprietario;
    }

    /**
     * @return the nm_tipo_imovel
     */
    public String getNm_tipo_imovel() {
        return nm_tipo_imovel;
    }

    /**
     * @param nm_tipo_imovel the nm_tipo_imovel to set
     */
    public void setNm_tipo_imovel(String nm_tipo_imovel) {
        this.nm_tipo_imovel = nm_tipo_imovel;
    }

    /**
     * @return the nm_finalidade
     */
    public String getNm_finalidade() {
        return nm_finalidade;
    }

    /**
     * @param nm_finalidade the nm_finalidade to set
     */
    public void setNm_finalidade(String nm_finalidade) {
        this.nm_finalidade = nm_finalidade;
    }

    /**
     * @return the nm_negocio
     */
    public String getNm_negocio() {
        return nm_negocio;
    }

    /**
     * @param nm_negocio the nm_negocio to set
     */
    public void setNm_negocio(String nm_negocio) {
        this.nm_negocio = nm_negocio;
    }

    /**
     * @return the nm_local_chaves
     */
    public String getNm_local_chaves() {
        return nm_local_chaves;
    }

    /**
     * @param nm_local_chaves the nm_local_chaves to set
     */
    public void setNm_local_chaves(String nm_local_chaves) {
        this.nm_local_chaves = nm_local_chaves;
    }

    /**
     * @return the nm_tipo_logradouro
     */
    public String getNm_tipo_logradouro() {
        return nm_tipo_logradouro;
    }

    /**
     * @param nm_tipo_logradouro the nm_tipo_logradouro to set
     */
    public void setNm_tipo_logradouro(String nm_tipo_logradouro) {
        this.nm_tipo_logradouro = nm_tipo_logradouro;
    }

    /**
     * @return the nm_logradouro
     */
    public String getNm_logradouro() {
        return nm_logradouro;
    }

    /**
     * @param nm_logradouro the nm_logradouro to set
     */
    public void setNm_logradouro(String nm_logradouro) {
        this.nm_logradouro = nm_logradouro;
    }

    /**
     * @return the qt_numero_logradouro
     */
    public String getQt_numero_logradouro() {
        return qt_numero_logradouro;
    }

    /**
     * @param qt_numero_logradouro the qt_numero_logradouro to set
     */
    public void setQt_numero_logradouro(String qt_numero_logradouro) {
        this.qt_numero_logradouro = qt_numero_logradouro;
    }

    /**
     * @return the nm_complemento_endereco
     */
    public String getNm_complemento_endereco() {
        return nm_complemento_endereco;
    }

    /**
     * @param nm_complemento_endereco the nm_complemento_endereco to set
     */
    public void setNm_complemento_endereco(String nm_complemento_endereco) {
        this.nm_complemento_endereco = nm_complemento_endereco;
    }

    /**
     * @return the nm_bairro
     */
    public String getNm_bairro() {
        return nm_bairro;
    }

    /**
     * @param nm_bairro the nm_bairro to set
     */
    public void setNm_bairro(String nm_bairro) {
        this.nm_bairro = nm_bairro;
    }

    /**
     * @return the nm_cidade
     */
    public String getNm_cidade() {
        return nm_cidade;
    }

    /**
     * @param nm_cidade the nm_cidade to set
     */
    public void setNm_cidade(String nm_cidade) {
        this.nm_cidade = nm_cidade;
    }

    /**
     * @return the sg_unidade_federativa
     */
    public String getSg_unidade_federativa() {
        return sg_unidade_federativa;
    }

    /**
     * @param sg_unidade_federativa the sg_unidade_federativa to set
     */
    public void setSg_unidade_federativa(String sg_unidade_federativa) {
        this.sg_unidade_federativa = sg_unidade_federativa;
    }

    /**
     * @return the ds_referencia_localizacao
     */
    public String getDs_referencia_localizacao() {
        return ds_referencia_localizacao;
    }

    /**
     * @param ds_referencia_localizacao the ds_referencia_localizacao to set
     */
    public void setDs_referencia_localizacao(String ds_referencia_localizacao) {
        this.ds_referencia_localizacao = ds_referencia_localizacao;
    }

    /**
     * @return the qt_area_terreno
     */
    public double getQt_area_terreno() {
        return qt_area_terreno;
    }

    /**
     * @param qt_area_terreno the qt_area_terreno to set
     */
    public void setQt_area_terreno(double qt_area_terreno) {
        this.qt_area_terreno = qt_area_terreno;
    }

    /**
     * @return the qt_area_construida
     */
    public double getQt_area_construida() {
        return qt_area_construida;
    }

    /**
     * @param qt_area_construida the qt_area_construida to set
     */
    public void setQt_area_construida(double qt_area_construida) {
        this.qt_area_construida = qt_area_construida;
    }

    /**
     * @return the qt_area_total
     */
    public double getQt_area_total() {
        return qt_area_total;
    }

    /**
     * @param qt_area_total the qt_area_total to set
     */
    public void setQt_area_total(double qt_area_total) {
        this.qt_area_total = qt_area_total;
    }

    /**
     * @return the qt_area_util
     */
    public double getQt_area_util() {
        return qt_area_util;
    }

    /**
     * @param qt_area_util the qt_area_util to set
     */
    public void setQt_area_util(double qt_area_util) {
        this.qt_area_util = qt_area_util;
    }

    /**
     * @return the qt_area_privada
     */
    public double getQt_area_privada() {
        return qt_area_privada;
    }

    /**
     * @param qt_area_privada the qt_area_privada to set
     */
    public void setQt_area_privada(double qt_area_privada) {
        this.qt_area_privada = qt_area_privada;
    }

    /**
     * @return the qt_area_comum
     */
    public double getQt_area_comum() {
        return qt_area_comum;
    }

    /**
     * @param qt_area_comum the qt_area_comum to set
     */
    public void setQt_area_comum(double qt_area_comum) {
        this.qt_area_comum = qt_area_comum;
    }

    /**
     * @return the nm_situacao
     */
    public String getNm_situacao() {
        return nm_situacao;
    }

    /**
     * @param nm_situacao the nm_situacao to set
     */
    public void setNm_situacao(String nm_situacao) {
        this.nm_situacao = nm_situacao;
    }

    /**
     * @return the ic_mobiliado
     */
    public char getIc_mobiliado() {
        return ic_mobiliado;
    }

    /**
     * @param ic_mobiliado the ic_mobiliado to set
     */
    public void setIc_mobiliado(char ic_mobiliado) {
        this.ic_mobiliado = ic_mobiliado;
    }

    /**
     * @return the qt_idade
     */
    public int getQt_idade() {
        return qt_idade;
    }

    /**
     * @param qt_idade the qt_idade to set
     */
    public void setQt_idade(int qt_idade) {
        this.qt_idade = qt_idade;
    }

    /**
     * @return the ic_enchente
     */
    public char getIc_enchente() {
        return ic_enchente;
    }

    /**
     * @param ic_enchente the ic_enchente to set
     */
    public void setIc_enchente(char ic_enchente) {
        this.ic_enchente = ic_enchente;
    }

    /**
     * @return the qt_apartamento_andar
     */
    public int getQt_apartamento_andar() {
        return qt_apartamento_andar;
    }

    /**
     * @param qt_apartamento_andar the qt_apartamento_andar to set
     */
    public void setQt_apartamento_andar(int qt_apartamento_andar) {
        this.qt_apartamento_andar = qt_apartamento_andar;
    }

    /**
     * @return the qt_elevador
     */
    public int getQt_elevador() {
        return qt_elevador;
    }

    /**
     * @param qt_elevador the qt_elevador to set
     */
    public void setQt_elevador(int qt_elevador) {
        this.qt_elevador = qt_elevador;
    }

    /**
     * @return the qt_topografia_terreno
     */
    public String getQt_topografia_terreno() {
        return qt_topografia_terreno;
    }

    /**
     * @param qt_topografia_terreno the qt_topografia_terreno to set
     */
    public void setQt_topografia_terreno(String qt_topografia_terreno) {
        this.qt_topografia_terreno = qt_topografia_terreno;
    }

    /**
     * @return the ds_documentacao
     */
    public String getDs_documentacao() {
        return ds_documentacao;
    }

    /**
     * @param ds_documentacao the ds_documentacao to set
     */
    public void setDs_documentacao(String ds_documentacao) {
        this.ds_documentacao = ds_documentacao;
    }

    /**
     * @return the qt_dormitorio
     */
    public int getQt_dormitorio() {
        return qt_dormitorio;
    }

    /**
     * @param qt_dormitorio the qt_dormitorio to set
     */
    public void setQt_dormitorio(int qt_dormitorio) {
        this.qt_dormitorio = qt_dormitorio;
    }

    /**
     * @return the ic_armario_dormitorio
     */
    public char getIc_armario_dormitorio() {
        return ic_armario_dormitorio;
    }

    /**
     * @param ic_armario_dormitorio the ic_armario_dormitorio to set
     */
    public void setIc_armario_dormitorio(char ic_armario_dormitorio) {
        this.ic_armario_dormitorio = ic_armario_dormitorio;
    }

    /**
     * @return the nm_tipo_piso_dormitorio
     */
    public String getNm_tipo_piso_dormitorio() {
        return nm_tipo_piso_dormitorio;
    }

    /**
     * @param nm_tipo_piso_dormitorio the nm_tipo_piso_dormitorio to set
     */
    public void setNm_tipo_piso_dormitorio(String nm_tipo_piso_dormitorio) {
        this.nm_tipo_piso_dormitorio = nm_tipo_piso_dormitorio;
    }

    /**
     * @return the ic_varanda_dormitorio
     */
    public char getIc_varanda_dormitorio() {
        return ic_varanda_dormitorio;
    }

    /**
     * @param ic_varanda_dormitorio the ic_varanda_dormitorio to set
     */
    public void setIc_varanda_dormitorio(char ic_varanda_dormitorio) {
        this.ic_varanda_dormitorio = ic_varanda_dormitorio;
    }

    /**
     * @return the ic_sacada_dormitorio
     */
    public char getIc_sacada_dormitorio() {
        return ic_sacada_dormitorio;
    }

    /**
     * @param ic_sacada_dormitorio the ic_sacada_dormitorio to set
     */
    public void setIc_sacada_dormitorio(char ic_sacada_dormitorio) {
        this.ic_sacada_dormitorio = ic_sacada_dormitorio;
    }

    /**
     * @return the qt_suite
     */
    public int getQt_suite() {
        return qt_suite;
    }

    /**
     * @param qt_suite the qt_suite to set
     */
    public void setQt_suite(int qt_suite) {
        this.qt_suite = qt_suite;
    }

    /**
     * @return the ic_armario_suite
     */
    public char getIc_armario_suite() {
        return ic_armario_suite;
    }

    /**
     * @param ic_armario_suite the ic_armario_suite to set
     */
    public void setIc_armario_suite(char ic_armario_suite) {
        this.ic_armario_suite = ic_armario_suite;
    }

    /**
     * @return the nm_tipo_piso_suite
     */
    public String getNm_tipo_piso_suite() {
        return nm_tipo_piso_suite;
    }

    /**
     * @param nm_tipo_piso_suite the nm_tipo_piso_suite to set
     */
    public void setNm_tipo_piso_suite(String nm_tipo_piso_suite) {
        this.nm_tipo_piso_suite = nm_tipo_piso_suite;
    }

    /**
     * @return the ic_closet_suite
     */
    public char getIc_closet_suite() {
        return ic_closet_suite;
    }

    /**
     * @param ic_closet_suite the ic_closet_suite to set
     */
    public void setIc_closet_suite(char ic_closet_suite) {
        this.ic_closet_suite = ic_closet_suite;
    }

    /**
     * @return the ic_hidromassagem_suite
     */
    public char getIc_hidromassagem_suite() {
        return ic_hidromassagem_suite;
    }

    /**
     * @param ic_hidromassagem_suite the ic_hidromassagem_suite to set
     */
    public void setIc_hidromassagem_suite(char ic_hidromassagem_suite) {
        this.ic_hidromassagem_suite = ic_hidromassagem_suite;
    }

    /**
     * @return the ic_varanda_suite
     */
    public char getIc_varanda_suite() {
        return ic_varanda_suite;
    }

    /**
     * @param ic_varanda_suite the ic_varanda_suite to set
     */
    public void setIc_varanda_suite(char ic_varanda_suite) {
        this.ic_varanda_suite = ic_varanda_suite;
    }

    /**
     * @return the ic_sacada_suite
     */
    public char getIc_sacada_suite() {
        return ic_sacada_suite;
    }

    /**
     * @param ic_sacada_suite the ic_sacada_suite to set
     */
    public void setIc_sacada_suite(char ic_sacada_suite) {
        this.ic_sacada_suite = ic_sacada_suite;
    }

    /**
     * @return the qt_sala
     */
    public int getQt_sala() {
        return qt_sala;
    }

    /**
     * @param qt_sala the qt_sala to set
     */
    public void setQt_sala(int qt_sala) {
        this.qt_sala = qt_sala;
    }

    /**
     * @return the qt_ambiente_sala
     */
    public int getQt_ambiente_sala() {
        return qt_ambiente_sala;
    }

    /**
     * @param qt_ambiente_sala the qt_ambiente_sala to set
     */
    public void setQt_ambiente_sala(int qt_ambiente_sala) {
        this.qt_ambiente_sala = qt_ambiente_sala;
    }

    /**
     * @return the nm_tipo_piso_sala
     */
    public String getNm_tipo_piso_sala() {
        return nm_tipo_piso_sala;
    }

    /**
     * @param nm_tipo_piso_sala the nm_tipo_piso_sala to set
     */
    public void setNm_tipo_piso_sala(String nm_tipo_piso_sala) {
        this.nm_tipo_piso_sala = nm_tipo_piso_sala;
    }

    /**
     * @return the ic_lareira_sala
     */
    public char getIc_lareira_sala() {
        return ic_lareira_sala;
    }

    /**
     * @param ic_lareira_sala the ic_lareira_sala to set
     */
    public void setIc_lareira_sala(char ic_lareira_sala) {
        this.ic_lareira_sala = ic_lareira_sala;
    }

    /**
     * @return the ic_bar_sala
     */
    public char getIc_bar_sala() {
        return ic_bar_sala;
    }

    /**
     * @param ic_bar_sala the ic_bar_sala to set
     */
    public void setIc_bar_sala(char ic_bar_sala) {
        this.ic_bar_sala = ic_bar_sala;
    }

    /**
     * @return the ic_sacada_sala
     */
    public char getIc_sacada_sala() {
        return ic_sacada_sala;
    }

    /**
     * @param ic_sacada_sala the ic_sacada_sala to set
     */
    public void setIc_sacada_sala(char ic_sacada_sala) {
        this.ic_sacada_sala = ic_sacada_sala;
    }

    /**
     * @return the qt_cozinha
     */
    public int getQt_cozinha() {
        return qt_cozinha;
    }

    /**
     * @param qt_cozinha the qt_cozinha to set
     */
    public void setQt_cozinha(int qt_cozinha) {
        this.qt_cozinha = qt_cozinha;
    }

    /**
     * @return the ic_copa_cozinha
     */
    public char getIc_copa_cozinha() {
        return ic_copa_cozinha;
    }

    /**
     * @param ic_copa_cozinha the ic_copa_cozinha to set
     */
    public void setIc_copa_cozinha(char ic_copa_cozinha) {
        this.ic_copa_cozinha = ic_copa_cozinha;
    }

    /**
     * @return the ic_planejada_cozinha
     */
    public char getIc_planejada_cozinha() {
        return ic_planejada_cozinha;
    }

    /**
     * @param ic_planejada_cozinha the ic_planejada_cozinha to set
     */
    public void setIc_planejada_cozinha(char ic_planejada_cozinha) {
        this.ic_planejada_cozinha = ic_planejada_cozinha;
    }

    /**
     * @return the ic_armario_cozinha
     */
    public char getIc_armario_cozinha() {
        return ic_armario_cozinha;
    }

    /**
     * @param ic_armario_cozinha the ic_armario_cozinha to set
     */
    public void setIc_armario_cozinha(char ic_armario_cozinha) {
        this.ic_armario_cozinha = ic_armario_cozinha;
    }

    /**
     * @return the nm_tipo_piso_cozinha
     */
    public String getNm_tipo_piso_cozinha() {
        return nm_tipo_piso_cozinha;
    }

    /**
     * @param nm_tipo_piso_cozinha the nm_tipo_piso_cozinha to set
     */
    public void setNm_tipo_piso_cozinha(String nm_tipo_piso_cozinha) {
        this.nm_tipo_piso_cozinha = nm_tipo_piso_cozinha;
    }

    /**
     * @return the nm_tipo_pia_cozinha
     */
    public String getNm_tipo_pia_cozinha() {
        return nm_tipo_pia_cozinha;
    }

    /**
     * @param nm_tipo_pia_cozinha the nm_tipo_pia_cozinha to set
     */
    public void setNm_tipo_pia_cozinha(String nm_tipo_pia_cozinha) {
        this.nm_tipo_pia_cozinha = nm_tipo_pia_cozinha;
    }

    /**
     * @return the ic_despensa_cozinha
     */
    public char getIc_despensa_cozinha() {
        return ic_despensa_cozinha;
    }

    /**
     * @param ic_despensa_cozinha the ic_despensa_cozinha to set
     */
    public void setIc_despensa_cozinha(char ic_despensa_cozinha) {
        this.ic_despensa_cozinha = ic_despensa_cozinha;
    }

    /**
     * @return the qt_banheiro
     */
    public int getQt_banheiro() {
        return qt_banheiro;
    }

    /**
     * @param qt_banheiro the qt_banheiro to set
     */
    public void setQt_banheiro(int qt_banheiro) {
        this.qt_banheiro = qt_banheiro;
    }

    /**
     * @return the ic_gabinete_banheiro
     */
    public char getIc_gabinete_banheiro() {
        return ic_gabinete_banheiro;
    }

    /**
     * @param ic_gabinete_banheiro the ic_gabinete_banheiro to set
     */
    public void setIc_gabinete_banheiro(char ic_gabinete_banheiro) {
        this.ic_gabinete_banheiro = ic_gabinete_banheiro;
    }

    /**
     * @return the ic_box_banheiro
     */
    public char getIc_box_banheiro() {
        return ic_box_banheiro;
    }

    /**
     * @param ic_box_banheiro the ic_box_banheiro to set
     */
    public void setIc_box_banheiro(char ic_box_banheiro) {
        this.ic_box_banheiro = ic_box_banheiro;
    }

    /**
     * @return the nm_tipo_box_banheiro
     */
    public String getNm_tipo_box_banheiro() {
        return nm_tipo_box_banheiro;
    }

    /**
     * @param nm_tipo_box_banheiro the nm_tipo_box_banheiro to set
     */
    public void setNm_tipo_box_banheiro(String nm_tipo_box_banheiro) {
        this.nm_tipo_box_banheiro = nm_tipo_box_banheiro;
    }

    /**
     * @return the nm_tipo_piso_banheiro
     */
    public String getNm_tipo_piso_banheiro() {
        return nm_tipo_piso_banheiro;
    }

    /**
     * @param nm_tipo_piso_banheiro the nm_tipo_piso_banheiro to set
     */
    public void setNm_tipo_piso_banheiro(String nm_tipo_piso_banheiro) {
        this.nm_tipo_piso_banheiro = nm_tipo_piso_banheiro;
    }

    /**
     * @return the qt_lavabo_banheiro
     */
    public int getQt_lavabo_banheiro() {
        return qt_lavabo_banheiro;
    }

    /**
     * @param qt_lavabo_banheiro the qt_lavabo_banheiro to set
     */
    public void setQt_lavabo_banheiro(int qt_lavabo_banheiro) {
        this.qt_lavabo_banheiro = qt_lavabo_banheiro;
    }

    /**
     * @return the qt_escritorio
     */
    public int getQt_escritorio() {
        return qt_escritorio;
    }

    /**
     * @param qt_escritorio the qt_escritorio to set
     */
    public void setQt_escritorio(int qt_escritorio) {
        this.qt_escritorio = qt_escritorio;
    }

    /**
     * @return the nm_tipo_piso_escritorio
     */
    public String getNm_tipo_piso_escritorio() {
        return nm_tipo_piso_escritorio;
    }

    /**
     * @param nm_tipo_piso_escritorio the nm_tipo_piso_escritorio to set
     */
    public void setNm_tipo_piso_escritorio(String nm_tipo_piso_escritorio) {
        this.nm_tipo_piso_escritorio = nm_tipo_piso_escritorio;
    }

    /**
     * @return the ic_dependencia_empregada
     */
    public char getIc_dependencia_empregada() {
        return ic_dependencia_empregada;
    }

    /**
     * @param ic_dependencia_empregada the ic_dependencia_empregada to set
     */
    public void setIc_dependencia_empregada(char ic_dependencia_empregada) {
        this.ic_dependencia_empregada = ic_dependencia_empregada;
    }

    /**
     * @return the ic_lavanderia
     */
    public char getIc_lavanderia() {
        return ic_lavanderia;
    }

    /**
     * @param ic_lavanderia the ic_lavanderia to set
     */
    public void setIc_lavanderia(char ic_lavanderia) {
        this.ic_lavanderia = ic_lavanderia;
    }

    /**
     * @return the ic_edicula
     */
    public char getIc_edicula() {
        return ic_edicula;
    }

    /**
     * @param ic_edicula the ic_edicula to set
     */
    public void setIc_edicula(char ic_edicula) {
        this.ic_edicula = ic_edicula;
    }

    /**
     * @return the ic_quintal
     */
    public char getIc_quintal() {
        return ic_quintal;
    }

    /**
     * @param ic_quintal the ic_quintal to set
     */
    public void setIc_quintal(char ic_quintal) {
        this.ic_quintal = ic_quintal;
    }

    /**
     * @return the ic_jardim
     */
    public char getIc_jardim() {
        return ic_jardim;
    }

    /**
     * @param ic_jardim the ic_jardim to set
     */
    public void setIc_jardim(char ic_jardim) {
        this.ic_jardim = ic_jardim;
    }

    /**
     * @return the ic_garagem
     */
    public char getIc_garagem() {
        return ic_garagem;
    }

    /**
     * @param ic_garagem the ic_garagem to set
     */
    public void setIc_garagem(char ic_garagem) {
        this.ic_garagem = ic_garagem;
    }

    /**
     * @return the qt_vaga_garagem
     */
    public int getQt_vaga_garagem() {
        return qt_vaga_garagem;
    }

    /**
     * @param qt_vaga_garagem the qt_vaga_garagem to set
     */
    public void setQt_vaga_garagem(int qt_vaga_garagem) {
        this.qt_vaga_garagem = qt_vaga_garagem;
    }

    /**
     * @return the ic_vaga_coberta
     */
    public char getIc_vaga_coberta() {
        return ic_vaga_coberta;
    }

    /**
     * @param ic_vaga_coberta the ic_vaga_coberta to set
     */
    public void setIc_vaga_coberta(char ic_vaga_coberta) {
        this.ic_vaga_coberta = ic_vaga_coberta;
    }

    /**
     * @return the ic_sauna
     */
    public char getIc_sauna() {
        return ic_sauna;
    }

    /**
     * @param ic_sauna the ic_sauna to set
     */
    public void setIc_sauna(char ic_sauna) {
        this.ic_sauna = ic_sauna;
    }

    /**
     * @return the ic_piscina
     */
    public char getIc_piscina() {
        return ic_piscina;
    }

    /**
     * @param ic_piscina the ic_piscina to set
     */
    public void setIc_piscina(char ic_piscina) {
        this.ic_piscina = ic_piscina;
    }

    /**
     * @return the ic_playground
     */
    public char getIc_playground() {
        return ic_playground;
    }

    /**
     * @param ic_playground the ic_playground to set
     */
    public void setIc_playground(char ic_playground) {
        this.ic_playground = ic_playground;
    }

    /**
     * @return the ic_quadra_poliesportiva
     */
    public char getIc_quadra_poliesportiva() {
        return ic_quadra_poliesportiva;
    }

    /**
     * @param ic_quadra_poliesportiva the ic_quadra_poliesportiva to set
     */
    public void setIc_quadra_poliesportiva(char ic_quadra_poliesportiva) {
        this.ic_quadra_poliesportiva = ic_quadra_poliesportiva;
    }

    /**
     * @return the ic_quadra_tenis
     */
    public char getIc_quadra_tenis() {
        return ic_quadra_tenis;
    }

    /**
     * @param ic_quadra_tenis the ic_quadra_tenis to set
     */
    public void setIc_quadra_tenis(char ic_quadra_tenis) {
        this.ic_quadra_tenis = ic_quadra_tenis;
    }

    /**
     * @return the ic_sala_ginastica
     */
    public char getIc_sala_ginastica() {
        return ic_sala_ginastica;
    }

    /**
     * @param ic_sala_ginastica the ic_sala_ginastica to set
     */
    public void setIc_sala_ginastica(char ic_sala_ginastica) {
        this.ic_sala_ginastica = ic_sala_ginastica;
    }

    /**
     * @return the ic_salao_festas
     */
    public char getIc_salao_festas() {
        return ic_salao_festas;
    }

    /**
     * @param ic_salao_festas the ic_salao_festas to set
     */
    public void setIc_salao_festas(char ic_salao_festas) {
        this.ic_salao_festas = ic_salao_festas;
    }

    /**
     * @return the ic_sala_jogos
     */
    public char getIc_sala_jogos() {
        return ic_sala_jogos;
    }

    /**
     * @param ic_sala_jogos the ic_sala_jogos to set
     */
    public void setIc_sala_jogos(char ic_sala_jogos) {
        this.ic_sala_jogos = ic_sala_jogos;
    }

    /**
     * @return the ic_churrasqueira
     */
    public char getIc_churrasqueira() {
        return ic_churrasqueira;
    }

    /**
     * @param ic_churrasqueira the ic_churrasqueira to set
     */
    public void setIc_churrasqueira(char ic_churrasqueira) {
        this.ic_churrasqueira = ic_churrasqueira;
    }

    /**
     * @return the ic_forno_pizza
     */
    public char getIc_forno_pizza() {
        return ic_forno_pizza;
    }

    /**
     * @param ic_forno_pizza the ic_forno_pizza to set
     */
    public void setIc_forno_pizza(char ic_forno_pizza) {
        this.ic_forno_pizza = ic_forno_pizza;
    }

    /**
     * @return the ic_tv_cabo
     */
    public char getIc_tv_cabo() {
        return ic_tv_cabo;
    }

    /**
     * @param ic_tv_cabo the ic_tv_cabo to set
     */
    public void setIc_tv_cabo(char ic_tv_cabo) {
        this.ic_tv_cabo = ic_tv_cabo;
    }

    /**
     * @return the ic_internet
     */
    public char getIc_internet() {
        return ic_internet;
    }

    /**
     * @param ic_internet the ic_internet to set
     */
    public void setIc_internet(char ic_internet) {
        this.ic_internet = ic_internet;
    }

    /**
     * @return the ic_canil
     */
    public char getIc_canil() {
        return ic_canil;
    }

    /**
     * @param ic_canil the ic_canil to set
     */
    public void setIc_canil(char ic_canil) {
        this.ic_canil = ic_canil;
    }

    /**
     * @return the ic_seguranca_patrimonial
     */
    public char getIc_seguranca_patrimonial() {
        return ic_seguranca_patrimonial;
    }

    /**
     * @param ic_seguranca_patrimonial the ic_seguranca_patrimonial to set
     */
    public void setIc_seguranca_patrimonial(char ic_seguranca_patrimonial) {
        this.ic_seguranca_patrimonial = ic_seguranca_patrimonial;
    }

    /**
     * @return the ic_condominio_fechado
     */
    public char getIc_condominio_fechado() {
        return ic_condominio_fechado;
    }

    /**
     * @param ic_condominio_fechado the ic_condominio_fechado to set
     */
    public void setIc_condominio_fechado(char ic_condominio_fechado) {
        this.ic_condominio_fechado = ic_condominio_fechado;
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
     * @return the vl_locacao_comercial
     */
    public double getVl_locacao_comercial() {
        return vl_locacao_comercial;
    }

    /**
     * @param vl_locacao_comercial the vl_locacao_comercial to set
     */
    public void setVl_locacao_comercial(double vl_locacao_comercial) {
        this.vl_locacao_comercial = vl_locacao_comercial;
    }

    /**
     * @return the vl_locacao_residencial
     */
    public double getVl_locacao_residencial() {
        return vl_locacao_residencial;
    }

    /**
     * @param vl_locacao_residencial the vl_locacao_residencial to set
     */
    public void setVl_locacao_residencial(double vl_locacao_residencial) {
        this.vl_locacao_residencial = vl_locacao_residencial;
    }

    /**
     * @return the vl_locacao_temporada
     */
    public double getVl_locacao_temporada() {
        return vl_locacao_temporada;
    }

    /**
     * @param vl_locacao_temporada the vl_locacao_temporada to set
     */
    public void setVl_locacao_temporada(double vl_locacao_temporada) {
        this.vl_locacao_temporada = vl_locacao_temporada;
    }

    /**
     * @return the vl_iptu
     */
    public double getVl_iptu() {
        return vl_iptu;
    }

    /**
     * @param vl_iptu the vl_iptu to set
     */
    public void setVl_iptu(double vl_iptu) {
        this.vl_iptu = vl_iptu;
    }

    /**
     * @return the cd_iptu_cadastro
     */
    public String getCd_iptu_cadastro() {
        return cd_iptu_cadastro;
    }

    /**
     * @param cd_iptu_cadastro the cd_iptu_cadastro to set
     */
    public void setCd_iptu_cadastro(String cd_iptu_cadastro) {
        this.cd_iptu_cadastro = cd_iptu_cadastro;
    }

    /**
     * @return the vl_condominio
     */
    public double getVl_condominio() {
        return vl_condominio;
    }

    /**
     * @param vl_condominio the vl_condominio to set
     */
    public void setVl_condominio(double vl_condominio) {
        this.vl_condominio = vl_condominio;
    }

    /**
     * @return the ds_imovel
     */
    public String getDs_imovel() {
        return ds_imovel;
    }

    /**
     * @param ds_imovel the ds_imovel to set
     */
    public void setDs_imovel(String ds_imovel) {
        this.ds_imovel = ds_imovel;
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
