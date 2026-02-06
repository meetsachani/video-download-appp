package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public class H22 extends Fragment {
    public View h2;
    public String i2;
    public TextView j2;
    public TextView k2;

    public H22(String str) {
        this.i2 = str;
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC11300zs1
    public View R0(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_setupone, viewGroup, false);
        this.h2 = inflate;
        this.j2 = (TextView) inflate.findViewById(R.id.title);
        this.k2 = (TextView) this.h2.findViewById(R.id.decelerate);
        if (this.i2.equals("One")) {
            this.h2.findViewById(R.id.iv_download).setVisibility(8);
            this.h2.findViewById(R.id.iv_paste).setVisibility(0);
            this.j2.setText("Paste Link to Download");
            this.k2.setText("Streaming videos repeatedly can consume significant amounts of data.");
        } else {
            this.h2.findViewById(R.id.iv_download).setVisibility(0);
            this.h2.findViewById(R.id.iv_paste).setVisibility(8);
            this.j2.setText("Download Your Video Now");
            this.k2.setText("Open a video downloader app, website, or browser extension and paste the link.");
        }
        return this.h2;
    }
}
