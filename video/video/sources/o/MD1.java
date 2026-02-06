package o;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.VideoPlayer.VideoListActivity;
import java.util.ArrayList;
import o.I7;

/* loaded from: classes3.dex */
public class MD1 extends Fragment {
    public C8888pz0 h2;
    public ArrayList<ZF2> i2 = new ArrayList<>();

    /* loaded from: classes3.dex */
    public class a implements InterfaceC9365rv1 {

        /* renamed from: o.MD1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0204a implements I7.f {
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;

            public C0204a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // o.I7.f
            public void a(boolean z) {
                Intent intent = new Intent(MD1.this.o(), VideoListActivity.class);
                intent.putExtra(C5036aE2.a, this.a);
                intent.putExtra(C5036aE2.b, this.b);
                MD1.this.A2(intent);
            }
        }

        public a() {
        }

        @Override // o.InterfaceC9365rv1
        public void a(String str, String str2) {
            I7.o(MD1.this.o(), new C0204a(str, str2), new boolean[0]);
        }
    }

    private void G2() {
        ArrayList<ZF2> arrayList = new ArrayList<>();
        this.i2 = arrayList;
        arrayList.addAll(LG.b(o()));
        if (!this.i2.isEmpty()) {
            this.h2.d.setVisibility(8);
            this.h2.c.setVisibility(0);
        } else {
            this.h2.d.setVisibility(0);
            this.h2.c.setVisibility(8);
        }
        this.h2.c.setAdapter(new C5044aG2(o(), this.i2, new a()));
    }

    @Override // androidx.fragment.app.Fragment
    public View R0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8888pz0 d = C8888pz0.d(layoutInflater, viewGroup, false);
        this.h2 = d;
        return d.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void i1() {
        super.i1();
        G2();
    }
}
