package o;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Helper.CategoryListActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.ArrayList;
import o.I7;

/* renamed from: o.Cz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2708Cz extends RecyclerView.AbstractC0370h<RecyclerView.H> {
    public static final int f = 0;
    public static final int g = 1;
    public static int h;
    public final Activity d;
    public final ArrayList<C2904Ez> e;

    /* renamed from: o.Cz$a */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.H {
        public a(View view) {
            super(view);
        }

        public void R() {
            LinearLayout linearLayout = (LinearLayout) this.a.findViewById(R.id.llnative_full);
            C11284zo1.c(C2708Cz.this.d, linearLayout, (LinearLayout) this.a.findViewById(R.id.llline_full), Boolean.FALSE);
        }
    }

    /* renamed from: o.Cz$b */
    /* loaded from: classes3.dex */
    public class b extends RecyclerView.H {
        public ShapeableImageView I;
        public TextView J;

        /* renamed from: o.Cz$b$a */
        /* loaded from: classes3.dex */
        public class a implements View.OnClickListener {
            public final /* synthetic */ C2904Ez X;

            /* renamed from: o.Cz$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0171a implements I7.f {
                public final /* synthetic */ ArrayList a;

                public C0171a(ArrayList arrayList) {
                    this.a = arrayList;
                }

                @Override // o.I7.f
                public void a(boolean z) {
                    Intent intent;
                    if (C2708Cz.h == 1) {
                        intent = new Intent(b.this.a.getContext(), CategoryListActivity.class);
                    } else {
                        intent = new Intent(b.this.a.getContext(), CategoryListActivity.class);
                    }
                    intent.putParcelableArrayListExtra("link", this.a);
                    C2708Cz.this.d.startActivity(intent);
                }
            }

            public a(C2904Ez c2904Ez) {
                this.X = c2904Ez;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Log.d("CHEKdkdkdk", "onClick:  " + this.X.a());
                for (int i = 0; i < this.X.b().size(); i++) {
                    Log.d("CHEKdkdkdk", "onClick:  " + this.X.b().get(i));
                }
                ArrayList arrayList = new ArrayList();
                int min = Math.min(this.X.b().size(), Math.min(this.X.d().size(), this.X.c().size()));
                for (int i2 = 0; i2 < min; i2++) {
                    C2806Dz c2806Dz = new C2806Dz();
                    c2806Dz.e(this.X.b().get(i2));
                    c2806Dz.f(this.X.d().get(i2));
                    c2806Dz.d(this.X.c().get(i2));
                    arrayList.add(c2806Dz);
                }
                Log.d("FHFHFH", "onClick: " + arrayList.size());
                I7.o((Activity) b.this.a.getContext(), new C0171a(arrayList), new boolean[0]);
            }
        }

        public b(View view) {
            super(view);
            this.I = (ShapeableImageView) view.findViewById(R.id.categoryImg);
            this.J = (TextView) view.findViewById(R.id.categoryname);
        }

        public void R(C2904Ez c2904Ez, int i) {
            this.J.setText(c2904Ez.a());
            if (!c2904Ez.b().isEmpty()) {
                com.bumptech.glide.a.F(this.a.getContext()).r(c2904Ez.b().get(0)).A0(R.drawable.bg_girls).C1(this.I);
            }
            this.a.setOnClickListener(new a(c2904Ez));
        }
    }

    public C2708Cz(Activity activity, ArrayList<C2904Ez> arrayList, int i) {
        this.d = activity;
        this.e = arrayList;
        h = i;
    }

    public final int K(int i) {
        return i - ((i / C2723Dd.L()) + 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        return this.e.size() + ((this.e.size() / C2723Dd.L()) - 1);
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
        int K = K(i);
        ((b) h2).R(this.e.get(K), K);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public RecyclerView.H z(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(LayoutInflater.from(this.d).inflate(R.layout.layout_native_ads_custom, viewGroup, false));
        }
        return new b(LayoutInflater.from(this.d).inflate(R.layout.item_category_list, viewGroup, false));
    }
}
