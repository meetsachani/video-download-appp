package o;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;
import o.FE1;

/* renamed from: o.Gf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3036Gf {
    public static final String e = "AsyncLayoutInflater";
    public LayoutInflater a;
    public Handler.Callback d = new a();
    public Handler b = new Handler(this.d);
    public d c = d.b();

    /* renamed from: o.Gf$a */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            c cVar = (c) message.obj;
            if (cVar.d == null) {
                cVar.d = C3036Gf.this.a.inflate(cVar.c, cVar.b, false);
            }
            cVar.e.a(cVar.d, cVar.c, cVar.b);
            C3036Gf.this.c.d(cVar);
            return true;
        }
    }

    /* renamed from: o.Gf$b */
    /* loaded from: classes.dex */
    public static class b extends LayoutInflater {
        public static final String[] a = {"android.widget.", "android.webkit.", "android.app."};

        public b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            for (String str2 : a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: o.Gf$c */
    /* loaded from: classes.dex */
    public static class c {
        public C3036Gf a;
        public ViewGroup b;
        public int c;
        public View d;
        public e e;
    }

    /* renamed from: o.Gf$d */
    /* loaded from: classes.dex */
    public static class d extends Thread {
        public static final d Z;
        public ArrayBlockingQueue<c> X = new ArrayBlockingQueue<>(10);
        public FE1.c<c> Y = new FE1.c<>(10);

        static {
            d dVar = new d();
            Z = dVar;
            dVar.start();
        }

        public static d b() {
            return Z;
        }

        public void a(c cVar) {
            try {
                this.X.put(cVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        public c c() {
            c a = this.Y.a();
            if (a == null) {
                return new c();
            }
            return a;
        }

        public void d(c cVar) {
            cVar.e = null;
            cVar.a = null;
            cVar.b = null;
            cVar.c = 0;
            cVar.d = null;
            this.Y.b(cVar);
        }

        public void e() {
            try {
                c take = this.X.take();
                try {
                    take.d = take.a.a.inflate(take.c, take.b, false);
                } catch (RuntimeException e) {
                    Log.w(C3036Gf.e, "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message.obtain(take.a.b, 0, take).sendToTarget();
            } catch (InterruptedException e2) {
                Log.w(C3036Gf.e, e2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                e();
            }
        }
    }

    /* renamed from: o.Gf$e */
    /* loaded from: classes.dex */
    public interface e {
        void a(View view, int i, ViewGroup viewGroup);
    }

    public C3036Gf(Context context) {
        this.a = new b(context);
    }

    public void a(int i, ViewGroup viewGroup, e eVar) {
        if (eVar != null) {
            c c2 = this.c.c();
            c2.a = this;
            c2.c = i;
            c2.b = viewGroup;
            c2.e = eVar;
            this.c.a(c2);
            return;
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}
