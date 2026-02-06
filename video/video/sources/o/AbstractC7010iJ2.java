package o;

import android.media.VolumeProvider;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.iJ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7010iJ2 {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public d e;
    public VolumeProvider f;

    /* renamed from: o.iJ2$a */
    /* loaded from: classes.dex */
    public class a extends VolumeProvider {
        public a(int i, int i2, int i3, String str) {
            super(i, i2, i3, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            AbstractC7010iJ2.this.f(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            AbstractC7010iJ2.this.g(i);
        }
    }

    /* renamed from: o.iJ2$b */
    /* loaded from: classes.dex */
    public class b extends VolumeProvider {
        public b(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            AbstractC7010iJ2.this.f(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            AbstractC7010iJ2.this.g(i);
        }
    }

    /* renamed from: o.iJ2$c */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }

    /* renamed from: o.iJ2$d */
    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract void a(AbstractC7010iJ2 abstractC7010iJ2);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.iJ2$e */
    /* loaded from: classes.dex */
    public @interface e {
    }

    public AbstractC7010iJ2(int i2, int i3, int i4) {
        this(i2, i3, i4, null);
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public Object e() {
        AbstractC7010iJ2 abstractC7010iJ2;
        if (this.f == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                abstractC7010iJ2 = this;
                abstractC7010iJ2.f = new a(this.a, this.b, this.d, this.c);
            } else {
                abstractC7010iJ2 = this;
                abstractC7010iJ2.f = new b(abstractC7010iJ2.a, abstractC7010iJ2.b, abstractC7010iJ2.d);
            }
        } else {
            abstractC7010iJ2 = this;
        }
        return abstractC7010iJ2.f;
    }

    public void h(d dVar) {
        this.e = dVar;
    }

    public final void i(int i2) {
        this.d = i2;
        c.a((VolumeProvider) e(), i2);
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    public AbstractC7010iJ2(int i2, int i3, int i4, String str) {
        this.a = i2;
        this.b = i3;
        this.d = i4;
        this.c = str;
    }

    public void f(int i2) {
    }

    public void g(int i2) {
    }
}
