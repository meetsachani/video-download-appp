package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o.GM1;

@Deprecated
/* renamed from: o.Wp  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4638Wp extends BaseAdapter {
    public final List<C4541Vp> X;
    public final Context Y;

    /* renamed from: o.Wp$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ String X;
        public final /* synthetic */ c Y;
        public final /* synthetic */ InterfaceFutureC8411o11 Z;

        public a(String str, c cVar, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
            this.X = str;
            this.Y = cVar;
            this.Z = interfaceFutureC8411o11;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            if (TextUtils.equals(this.X, this.Y.b.getText())) {
                try {
                    bitmap = (Bitmap) this.Z.get();
                } catch (InterruptedException | ExecutionException unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    this.Y.a.setVisibility(0);
                    this.Y.a.setImageBitmap(bitmap);
                    return;
                }
                this.Y.a.setVisibility(4);
                this.Y.a.setImageBitmap(null);
            }
        }
    }

    /* renamed from: o.Wp$b */
    /* loaded from: classes.dex */
    public class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: o.Wp$c */
    /* loaded from: classes.dex */
    public static class c {
        public final ImageView a;
        public final TextView b;

        public c(ImageView imageView, TextView textView) {
            this.a = imageView;
            this.b = textView;
        }
    }

    public C4638Wp(List<C4541Vp> list, Context context) {
        this.X = list;
        this.Y = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.X.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.X.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar;
        C4541Vp c4541Vp = this.X.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.Y).inflate(GM1.d.b, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(GM1.c.b);
            TextView textView = (TextView) view.findViewById(GM1.c.c);
            if (imageView != null && textView != null) {
                cVar = new c(imageView, textView);
                view.setTag(cVar);
            } else {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
        } else {
            cVar = (c) view.getTag();
        }
        String e = c4541Vp.e();
        cVar.b.setText(e);
        if (c4541Vp.b() != 0) {
            cVar.a.setImageDrawable(C10231vT1.g(this.Y.getResources(), c4541Vp.b(), null));
            return view;
        } else if (c4541Vp.c() != null) {
            InterfaceFutureC8411o11<Bitmap> o2 = C5179aq.o(this.Y.getContentResolver(), c4541Vp.c());
            o2.h4(new a(e, cVar, o2), new b());
            return view;
        } else {
            cVar.a.setImageBitmap(null);
            cVar.a.setVisibility(4);
            return view;
        }
    }
}
