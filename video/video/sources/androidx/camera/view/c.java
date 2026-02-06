package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import java.util.concurrent.Executor;
import o.C3051Gi2;
import o.InterfaceFutureC8411o11;

/* loaded from: classes.dex */
public abstract class c {
    public Size a;
    public FrameLayout b;
    public final b c;
    public boolean d = false;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public c(FrameLayout frameLayout, b bVar) {
        this.b = frameLayout;
        this.c = bVar;
    }

    public Bitmap a() {
        Bitmap c = c();
        if (c == null) {
            return null;
        }
        return this.c.a(c, new Size(this.b.getWidth(), this.b.getHeight()), this.b.getLayoutDirection());
    }

    public abstract View b();

    public abstract Bitmap c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public void g() {
        this.d = true;
        i();
    }

    public abstract void h(C3051Gi2 c3051Gi2, a aVar);

    public void i() {
        View b = b();
        if (b != null && this.d) {
            this.c.s(new Size(this.b.getWidth(), this.b.getHeight()), this.b.getLayoutDirection(), b);
        }
    }

    public void j(Executor executor, PreviewView.e eVar) {
    }

    public abstract InterfaceFutureC8411o11<Void> k();
}
