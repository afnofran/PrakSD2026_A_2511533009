package pekan3_2511533009;

import java.util.ArrayList;

class Siswa_2511533009{
    String nama_3009;
    int nim_3009;
    public Siswa_2511533009(String nama_3009,int nim_3009){
        this.nama_3009 =nama_3009;
        this.nim_3009 =nim_3009;
    }

    @Override
    public String toString(){
        return "Nim: " + nim_3009 + ", Nama: " + nama_3009;
    }
}
public class SiswaStack_2511533009 {
    private ArrayList<Siswa_2511533009> stack_3009;

    public SiswaStack_2511533009(){
        stack_3009 = new ArrayList<>();
    }

    public void push_3009(Siswa_2511533009 mhs_3009){
        stack_3009.add(mhs_3009);
    }

    public Siswa_2511533009 pop_3009(){
        if (!isEmpty_3009()){
            return stack_3009.remove(stack_3009.size() - 1);
        }
        return null;
    }

    public Siswa_2511533009 peek_3009(){
        if (!isEmpty_3009()) {

            return stack_3009.get(stack_3009.size()-1);
        }
        return null;
    }

    public boolean isEmpty_3009(){
        return stack_3009.isEmpty();
    }

    public void tampilkanSiswa_3009(){
        for (int i = stack_3009.size() - 1; i>=0;i--){
            System.out.println(stack_3009.get(i));
        }
    }
    public static void main(String[] args){
        SiswaStack_2511533009 studentStack_3009=  new SiswaStack_2511533009();

        Siswa_2511533009 mhs1_3009 = new Siswa_2511533009("Ali",1);
        Siswa_2511533009 mhs2_3009 = new Siswa_2511533009("Boby",2);
        Siswa_2511533009 mhs3_3009 = new Siswa_2511533009("Charles",3);
        studentStack_3009.push_3009(mhs1_3009);
        studentStack_3009.push_3009(mhs2_3009);
        studentStack_3009.push_3009(mhs3_3009);

        System.out.println("Siswa di dalam stack:");
        studentStack_3009.tampilkanSiswa_3009();

        System.out.println("siswa teratas " + studentStack_3009.peek_3009());
        System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack_3009.pop_3009());
        System.out.println("daftar siswa setelah di pop :");
        studentStack_3009.tampilkanSiswa_3009();
    }
}