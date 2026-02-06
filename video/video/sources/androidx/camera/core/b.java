package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.g;
import java.util.HashSet;
import java.util.Set;
import o.YM0;

/* loaded from: classes.dex */
public abstract class b implements g {
    public final g Y;
    public final Object X = new Object();
    public final Set<a> Z = new HashSet();

    /* loaded from: classes.dex */
    public interface a {
        void b(g gVar);
    }

    public b(g gVar) {
        this.Y = gVar;
    }

    @Override // androidx.camera.core.g
    public YM0 I4() {
        return this.Y.I4();
    }

    @Override // androidx.camera.core.g
    public Rect L3() {
        return this.Y.L3();
    }

    @Override // androidx.camera.core.g
    public Image X4() {
        return this.Y.X4();
    }

    public void a(a aVar) {
        synchronized (this.X) {
            this.Z.add(aVar);
        }
    }

    @Override // androidx.camera.core.g
    public void b2(Rect rect) {
        this.Y.b2(rect);
    }

    @Override // androidx.camera.core.g, java.lang.AutoCloseable
    public void close() {
        this.Y.close();
        d();
    }

    public void d() {
        HashSet<a> hashSet;
        synchronized (this.X) {
            hashSet = new HashSet(this.Z);
        }
        for (a aVar : hashSet) {
            aVar.b(this);
        }
    }

    @Override // androidx.camera.core.g
    public g.a[] f3() {
        return this.Y.f3();
    }

    @Override // androidx.camera.core.g
    public int getFormat() {
        return this.Y.getFormat();
    }

    @Override // androidx.camera.core.g
    public int getHeight() {
        return this.Y.getHeight();
    }

    @Override // androidx.camera.core.g
    public int getWidth() {
        return this.Y.getWidth();
    }
}
