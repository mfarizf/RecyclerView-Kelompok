package com.example.recyclerviewkelompok;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MailAdapter extends RecyclerView.Adapter<MailAdapter.ViewHolder> {
    String[] judul = {"Hai","Kerjaan","Wisata","Penerimaan Siswa","Wawancara Kerja"};
    String[] isi = {"Nama Saya Adalah Fariz","Kamu Harus Selesaikan tugasmu sebelum deadline","Pantai Kuta sangatlah menarik untuk di kunjungi","Selamat kamu masuk SMKN 4 Bandung","Jangan Lupa Interview nya tanggal 10 September 2019"};
    String[] waktu = {"10.29","11.20","9.18","6.22","7.55"};

    private String[] subjek;
    MailAdapter(String[] subjek){
        this.subjek = subjek;
    }


    @NonNull
    @Override
    public MailAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mail, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MailAdapter.ViewHolder holder, int position) {
        holder.bind(subjek[position],judul[position],isi[position],waktu[position]);
    }

    @Override
    public int getItemCount() {
        return subjek.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvSubjek, tvJudul, tvWaktu, tvIsi;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvIsi = itemView.findViewById(R.id.tvIsi);
            tvJudul = itemView.findViewById(R.id.tvJudul);
            tvWaktu = itemView.findViewById(R.id.tvWaktu);
            tvSubjek = itemView.findViewById(R.id.tvSubjek);
        }
        void bind(String subjek,String judul,String isi,String waktu){
            tvSubjek.setText(subjek);
            tvJudul.setText(judul);
            tvWaktu.setText(waktu);
            tvIsi.setText(isi);
        }
    }
}
