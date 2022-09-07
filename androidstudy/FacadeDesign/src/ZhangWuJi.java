public class ZhangWuJi {
    private ZhaoShi zhaoShi;
    private JingMai jingMai;
    private NeiGong neiGong;

    public ZhangWuJi() {
        zhaoShi = new ZhaoShi();
        jingMai = new JingMai();
        neiGong = new NeiGong();
    }

    public void qianKun() {
        jingMai.JingMai();
        neiGong.QianKun();
    }

    public void qiShang() {
        jingMai.JingMai();
        neiGong.JiuYang();
        zhaoShi.QiShanQuan();
    }
}
