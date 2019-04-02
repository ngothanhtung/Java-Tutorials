/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap6encapsulation;

/**
 *
 * @author softech
 */
public class SinhVien {
    private float _diem;
    private String _ten;
    
    public void setDiem(float diem) throws Exception {
        if (diem < 0 || diem > 10) {
            throw new Exception("Diem khong hop le");
        }
        
        
        
        this._diem = diem;
    }
    
    public float getDiem(){
        return this._diem;
    }
    
    public void hienThi() {
        System.out.println("Diem: " + this._diem);
    }

    /**
     * @return the _ten
     */
    public String getTen() {
        return _ten;
    }

    /**
     * @param _ten the _ten to set
     */
    public void setTen(String _ten) {
        
        this._ten = _ten;
    }
}
