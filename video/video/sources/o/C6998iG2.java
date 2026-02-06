package o;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.VideoViewActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import o.I7;

/* renamed from: o.iG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6998iG2 extends RecyclerView.AbstractC0370h<RecyclerView.H> {
    public static final int g = 0;
    public static final int h = 1;
    public final Activity d;
    public int e;
    public ArrayList<C2806Dz> f;

    /* renamed from: o.iG2$a */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.H {
        public a(View view) {
            super(view);
        }

        public void R() {
            LinearLayout linearLayout = (LinearLayout) this.a.findViewById(R.id.llnative_full);
            C11284zo1.c(C6998iG2.this.d, linearLayout, (LinearLayout) this.a.findViewById(R.id.llline_full), Boolean.FALSE);
        }
    }

    /* renamed from: o.iG2$b */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.H {
        public ImageView I;
        public TextView J;

        /* renamed from: o.iG2$b$a */
        /* loaded from: classes3.dex */
        public class a implements View.OnClickListener {
            public final /* synthetic */ C2806Dz X;

            /* renamed from: o.iG2$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0290a implements I7.f {
                public C0290a() {
                }

                @Override // o.I7.f
                public void a(boolean z) {
                    Intent intent = new Intent(b.this.a.getContext(), VideoViewActivity.class);
                    intent.putExtra("videoUrl", a.this.X.c());
                    intent.putExtra("vtype", C6998iG2.this.e);
                    intent.putParcelableArrayListExtra("link", C6998iG2.this.f);
                    C6998iG2.this.d.startActivity(intent);
                    C6998iG2 c6998iG2 = C6998iG2.this;
                    if (c6998iG2.e == 1) {
                        c6998iG2.d.finish();
                    }
                }
            }

            public a(C2806Dz c2806Dz) {
                this.X = c2806Dz;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Log.d("CHEKdkdkdk", "getName:  " + this.X.a());
                Log.d("CHEKdkdkdk", "getVideoUri:  " + this.X.c());
                I7.o(C6998iG2.this.d, new C0290a(), new boolean[0]);
            }
        }

        public b(View view) {
            super(view);
            this.I = (ImageView) view.findViewById(R.id.thumbnail);
            this.J = (TextView) view.findViewById(R.id.title);
        }

        public void R(C2806Dz c2806Dz) {
            this.J.setText(c2806Dz.a());
            com.bumptech.glide.a.F(this.a.getContext()).r(c2806Dz.b()).C1(this.I);
            this.a.setOnClickListener(new a(c2806Dz));
        }
    }

    public C6998iG2(Activity activity, ArrayList<C2806Dz> arrayList, int i) {
        new ArrayList();
        this.d = activity;
        this.f = arrayList;
        this.e = i;
    }

    private int L(int i) {
        return i - ((i / C2723Dd.L()) + 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.f.size() + ((this.f.size() / C2723Dd.L()) - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int i(int i) {
        if (i != 0 && i % C2723Dd.L() != 0) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public void x(RecyclerView.H h2, int i) {
        if (i(i) == 1) {
            ((a) h2).R();
            return;
        }
        ((b) h2).R(this.f.get(L(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public RecyclerView.H z(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(LayoutInflater.from(this.d).inflate(R.layout.layout_native_ads_custom, viewGroup, false));
        }
        return new b(LayoutInflater.from(this.d).inflate(R.layout.video_item, viewGroup, false));
    }
}
