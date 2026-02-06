package o;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WatchVideo.PlayDailyActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.List;
import o.C6751hF2;
import o.I7;

/* renamed from: o.hF2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6751hF2 extends RecyclerView.AbstractC0370h<b> {
    public List<C6253fF2> d;
    public Activity e;

    /* renamed from: o.hF2$a */
    /* loaded from: classes3.dex */
    public class a implements I7.f {
        public final /* synthetic */ C6253fF2 a;

        public a(C6253fF2 c6253fF2) {
            this.a = c6253fF2;
        }

        @Override // o.I7.f
        public void a(boolean z) {
            Intent intent = new Intent(C6751hF2.this.e, PlayDailyActivity.class);
            intent.putExtra("video_url", this.a.e());
            C6751hF2.this.e.startActivity(intent);
        }
    }

    /* renamed from: o.hF2$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.H {
        public ImageView I;
        public TextView J;
        public TextView K;

        public b(@InterfaceC5670cr1 View view) {
            super(view);
            this.I = (ImageView) view.findViewById(R.id.thumbnail);
            this.J = (TextView) view.findViewById(R.id.title);
            this.K = (TextView) view.findViewById(R.id.duration);
        }
    }

    public C6751hF2(Activity activity, List<C6253fF2> list) {
        this.e = activity;
        this.d = list;
    }

    public final String L(int i) {
        int i2 = i / 3600;
        int i3 = (i % 3600) / 60;
        int i4 = i % 60;
        if (i2 > 0) {
            return String.format("%02d:%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format("%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: M */
    public void x(@InterfaceC5670cr1 b bVar, int i) {
        final C6253fF2 c6253fF2 = this.d.get(i);
        bVar.J.setText(c6253fF2.d());
        com.bumptech.glide.a.D(this.e).r(c6253fF2.c()).C1(bVar.I);
        bVar.K.setText(L(c6253fF2.a()));
        bVar.a.setOnClickListener(new View.OnClickListener() { // from class: o.gF2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                I7.o(r0.e, new C6751hF2.a(c6253fF2), new boolean[0]);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    @InterfaceC5670cr1
    /* renamed from: N */
    public b z(@InterfaceC5670cr1 ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.e).inflate(R.layout.item_video, viewGroup, false));
    }

    public void O(List<C6253fF2> list) {
        this.d = list;
        m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        List<C6253fF2> list = this.d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
