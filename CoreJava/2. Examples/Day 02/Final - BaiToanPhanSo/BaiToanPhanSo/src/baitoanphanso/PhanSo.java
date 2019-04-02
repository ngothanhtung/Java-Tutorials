package baitoanphanso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author softech
 * @ref
 * https://vi.wikipedia.org/wiki/Ph%C3%A2n_s%E1%BB%91#Ph.C3.A9p_c.E1.BB.99ng
 */
public class PhanSo {

    public int TuSo;
    public int MauSo;

    public PhanSo() {

    }

    public PhanSo(int tuso, int mauso) {
        this.TuSo = tuso;
        this.MauSo = mauso;
    }

    public PhanSo Cong(PhanSo ps) {
        PhanSo ketqua = new PhanSo();

        if (this.MauSo == ps.MauSo) {
            ketqua.TuSo = this.TuSo + ps.TuSo;
            ketqua.MauSo = this.MauSo;

        } else {
            ketqua.TuSo = (this.TuSo * ps.MauSo) + (this.MauSo * ps.TuSo);
            ketqua.MauSo = this.MauSo * ps.MauSo;
        }

        return ketqua;
    }

    public PhanSo Tru(PhanSo ps) {

        PhanSo ketqua = new PhanSo();

        if (this.MauSo == ps.MauSo) {
            ketqua.TuSo = this.TuSo - ps.TuSo;
            ketqua.MauSo = this.MauSo;

        } else {
            ketqua.TuSo = (this.TuSo * ps.MauSo) - (this.MauSo * ps.TuSo);
            ketqua.MauSo = this.MauSo * ps.MauSo;
        }

        return ketqua;
    }

    public PhanSo Nhan(PhanSo ps) {

        PhanSo ketqua = new PhanSo();

        ketqua.TuSo = this.TuSo * ps.TuSo;
        ketqua.MauSo = this.MauSo * ps.MauSo;

        return ketqua;
    }

    public PhanSo Chia(PhanSo ps) {

        PhanSo daonguoc = new PhanSo();
        daonguoc.TuSo = ps.MauSo;
        daonguoc.MauSo = ps.TuSo;

        PhanSo ketqua = Nhan(daonguoc);

        return ketqua;
    }

    public PhanSo ToiGian() {
        PhanSo ketqua = new PhanSo();
        
        int uscln = UocSoChungLonNhat(this.TuSo, this.MauSo);
        ketqua.TuSo = this.TuSo / uscln;
        ketqua.MauSo = this.MauSo / uscln;

        return ketqua;
    }

    // Giai thuat Euclid
    // ref: https://vi.wikipedia.org/wiki/Gi%E1%BA%A3i_thu%E1%BA%ADt_Euclid
    private int UocSoChungLonNhat(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return UocSoChungLonNhat(y, x % y);
        }
    }

    @Override
    public String toString() {
        if (this.MauSo == 1) {
            return this.TuSo + "";
        }

        return this.TuSo + " / " + this.MauSo;
    }
    
    public float toFloat() {
        return (float)this.TuSo / (float) this.MauSo;
    }
}
