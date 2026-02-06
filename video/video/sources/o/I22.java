package o;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;

/* loaded from: classes3.dex */
public class I22 extends Fragment {
    public View h2;

    @Override // androidx.fragment.app.Fragment
    @InterfaceC11300zs1
    public View R0(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_setupthree, viewGroup, false);
        this.h2 = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image);
        int i = o().getSharedPreferences("ThemePrefs", 0).getInt("theme_mode", -1);
        if (i == 2) {
            imageView.setImageResource(R.drawable.setup_3_dark);
        } else if (i == 1) {
            imageView.setImageResource(R.drawable.setup_3);
        } else if (i == -1) {
            if ((Y().getConfiguration().uiMode & 48) == 32) {
                imageView.setImageResource(R.drawable.setup_3_dark);
            } else {
                imageView.setImageResource(R.drawable.setup_3);
            }
        }
        return this.h2;
    }
}
