/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

/**
 *
 * @author sekar
 */

//KELAS MAHASISWA
public class Mahasiswa
{
    //PRIVATE ATRIBUT
    private String nim;
    private String nama;
    private String nilai;
    private String gender;
    
    //KONSTRUKTOR
    public Mahasiswa(String nim, String nama, String nilai, String gender)
    {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.gender = gender;
    }
    
    //SETTER
    public void setNim(String nim) 
    {
        this.nim = nim;
    }
    
    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
    public void setNilai(String nilai) 
    {
        this.nilai = nilai;
    }
    
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    //GETTER
    public String getNim() 
    {
        return this.nim;
    }
    
    public String getNama() 
    {
        return this.nama;
    }
    
    public String getNilai() 
    {
        return this.nilai;
    }
    
    public String getGender() 
    {
        return this.gender;
    }
}
