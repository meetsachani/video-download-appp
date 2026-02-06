package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.AbstractC3115Ha0;
import o.C10907yF1;
import o.C11074yw2;
import o.C11317zw2;
import o.C2712Da0;
import o.C3228Ie;

/* loaded from: classes.dex */
public class c {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = Integer.MAX_VALUE;
    public static final Object D = new Object();
    public static final Object E = new Object();
    public static volatile c F = null;
    public static volatile boolean G = false;
    public static final String H = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* renamed from: o */
    public static final String f30o = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final String p = "android.support.text.emoji.emojiCompat_replaceAll";
    public static final int q = 3;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z = 0;
    public final Set<g> b;
    public final C0022c e;
    public final j f;
    public final m g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final boolean k;
    public final int l;
    public final int m;
    public final f n;
    public final ReadWriteLock a = new ReentrantReadWriteLock();
    public volatile int c = 3;
    public final Handler d = new Handler(Looper.getMainLooper());

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* loaded from: classes.dex */
    public static final class b extends C0022c {
        public volatile androidx.emoji2.text.d b;
        public volatile androidx.emoji2.text.f c;

        /* loaded from: classes.dex */
        public class a extends k {
            public a() {
                b.this = r1;
            }

            @Override // androidx.emoji2.text.c.k
            public void a(Throwable th) {
                b.this.a.v(th);
            }

            @Override // androidx.emoji2.text.c.k
            public void b(androidx.emoji2.text.f fVar) {
                b.this.j(fVar);
            }
        }

        public b(c cVar) {
            super(cVar);
        }

        @Override // androidx.emoji2.text.c.C0022c
        public String a() {
            String N = this.c.g().N();
            if (N == null) {
                return "";
            }
            return N;
        }

        @Override // androidx.emoji2.text.c.C0022c
        public int b(CharSequence charSequence, int i) {
            return this.b.b(charSequence, i);
        }

        @Override // androidx.emoji2.text.c.C0022c
        public int c(CharSequence charSequence, int i) {
            return this.b.d(charSequence, i);
        }

        @Override // androidx.emoji2.text.c.C0022c
        public int d(CharSequence charSequence, int i) {
            return this.b.e(charSequence, i);
        }

        @Override // androidx.emoji2.text.c.C0022c
        public boolean e(CharSequence charSequence) {
            if (this.b.c(charSequence) == 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.c.C0022c
        public boolean f(CharSequence charSequence, int i) {
            if (this.b.d(charSequence, i) == 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.c.C0022c
        public void g() {
            try {
                this.a.f.a(new a());
            } catch (Throwable th) {
                this.a.v(th);
            }
        }

        @Override // androidx.emoji2.text.c.C0022c
        public CharSequence h(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.b.l(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.c.C0022c
        public void i(EditorInfo editorInfo) {
            editorInfo.extras.putInt(c.f30o, this.c.h());
            editorInfo.extras.putBoolean(c.p, this.a.h);
        }

        public void j(androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.a.v(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.c = fVar;
            androidx.emoji2.text.f fVar2 = this.c;
            m mVar = this.a.g;
            f fVar3 = this.a.n;
            c cVar = this.a;
            this.b = new androidx.emoji2.text.d(fVar2, mVar, fVar3, cVar.i, cVar.j, C2712Da0.a());
            this.a.w();
        }
    }

    /* renamed from: androidx.emoji2.text.c$c */
    /* loaded from: classes.dex */
    public static class C0022c {
        public final c a;

        public C0022c(c cVar) {
            this.a = cVar;
        }

        public String a() {
            return "";
        }

        public int b(CharSequence charSequence, int i) {
            return -1;
        }

        public int c(CharSequence charSequence, int i) {
            return 0;
        }

        public int d(CharSequence charSequence, int i) {
            return -1;
        }

        public boolean e(CharSequence charSequence) {
            return false;
        }

        public boolean f(CharSequence charSequence, int i) {
            return false;
        }

        public void g() {
            this.a.w();
        }

        public CharSequence h(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return charSequence;
        }

        public void i(EditorInfo editorInfo) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public final j a;
        public m b;
        public boolean c;
        public boolean d;
        public int[] e;
        public Set<g> f;
        public boolean g;
        public int h = -16711936;
        public int i = 0;
        public f j = new androidx.emoji2.text.b();

        public d(j jVar) {
            C10907yF1.m(jVar, "metadataLoader cannot be null.");
            this.a = jVar;
        }

        public final j a() {
            return this.a;
        }

        public d b(g gVar) {
            C10907yF1.m(gVar, "initCallback cannot be null");
            if (this.f == null) {
                this.f = new C3228Ie();
            }
            this.f.add(gVar);
            return this;
        }

        public d c(int i) {
            this.h = i;
            return this;
        }

        public d d(boolean z) {
            this.g = z;
            return this;
        }

        public d e(f fVar) {
            C10907yF1.m(fVar, "GlyphChecker cannot be null");
            this.j = fVar;
            return this;
        }

        public d f(int i) {
            this.i = i;
            return this;
        }

        public d g(boolean z) {
            this.c = z;
            return this;
        }

        public d h(m mVar) {
            this.b = mVar;
            return this;
        }

        public d i(boolean z) {
            return j(z, null);
        }

        public d j(boolean z, List<Integer> list) {
            this.d = z;
            if (z && list != null) {
                this.e = new int[list.size()];
                int i = 0;
                for (Integer num : list) {
                    this.e[i] = num.intValue();
                    i++;
                }
                Arrays.sort(this.e);
                return this;
            }
            this.e = null;
            return this;
        }

        public d k(g gVar) {
            C10907yF1.m(gVar, "initCallback cannot be null");
            Set<g> set = this.f;
            if (set != null) {
                set.remove(gVar);
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements m {
        @Override // androidx.emoji2.text.c.m
        public AbstractC3115Ha0 a(C11074yw2 c11074yw2) {
            return new C11317zw2(c11074yw2);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Runnable {
        public final List<g> X;
        public final Throwable Y;
        public final int Z;

        public h(g gVar, int i) {
            this(Arrays.asList((g) C10907yF1.m(gVar, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.X.size();
            int i = 0;
            if (this.Z != 1) {
                while (i < size) {
                    this.X.get(i).a(this.Y);
                    i++;
                }
                return;
            }
            while (i < size) {
                this.X.get(i).b();
                i++;
            }
        }

        public h(Collection<g> collection, int i) {
            this(collection, i, null);
        }

        public h(Collection<g> collection, int i, Throwable th) {
            C10907yF1.m(collection, "initCallbacks cannot be null");
            this.X = new ArrayList(collection);
            this.Z = i;
            this.Y = th;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface i {
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(k kVar);
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.f fVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
        AbstractC3115Ha0 a(C11074yw2 c11074yw2);
    }

    public c(d dVar) {
        this.h = dVar.c;
        this.i = dVar.d;
        this.j = dVar.e;
        this.k = dVar.g;
        this.l = dVar.h;
        this.f = dVar.a;
        this.m = dVar.i;
        this.n = dVar.j;
        C3228Ie c3228Ie = new C3228Ie();
        this.b = c3228Ie;
        m mVar = dVar.b;
        this.g = mVar == null ? new e() : mVar;
        Set<g> set = dVar.f;
        if (set != null && !set.isEmpty()) {
            c3228Ie.addAll(dVar.f);
        }
        this.e = new b(this);
        u();
    }

    public static c C(d dVar) {
        c cVar;
        synchronized (D) {
            cVar = new c(dVar);
            F = cVar;
        }
        return cVar;
    }

    public static c D(c cVar) {
        c cVar2;
        synchronized (D) {
            F = cVar;
            cVar2 = F;
        }
        return cVar2;
    }

    public static void E(boolean z2) {
        synchronized (E) {
            G = z2;
        }
    }

    public static c c() {
        c cVar;
        boolean z2;
        synchronized (D) {
            cVar = F;
            if (cVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C10907yF1.o(z2, H);
        }
        return cVar;
    }

    public static boolean j(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
        return androidx.emoji2.text.d.f(inputConnection, editable, i2, i3, z2);
    }

    public static boolean k(Editable editable, int i2, KeyEvent keyEvent) {
        return androidx.emoji2.text.d.g(editable, i2, keyEvent);
    }

    public static c n(Context context) {
        return o(context, null);
    }

    public static c o(Context context, a.C0021a c0021a) {
        c cVar;
        if (G) {
            return F;
        }
        if (c0021a == null) {
            c0021a = new a.C0021a(null);
        }
        d c = c0021a.c(context);
        synchronized (E) {
            try {
                if (!G) {
                    if (c != null) {
                        p(c);
                    }
                    G = true;
                }
                cVar = F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static c p(d dVar) {
        c cVar;
        c cVar2 = F;
        if (cVar2 == null) {
            synchronized (D) {
                try {
                    cVar = F;
                    if (cVar == null) {
                        cVar = new c(dVar);
                        F = cVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return cVar;
        }
        return cVar2;
    }

    public static boolean q() {
        if (F != null) {
            return true;
        }
        return false;
    }

    public CharSequence A(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C10907yF1.o(s(), "Not initialized yet");
        C10907yF1.j(i2, "start cannot be negative");
        C10907yF1.j(i3, "end cannot be negative");
        C10907yF1.j(i4, "maxEmojiCount cannot be negative");
        boolean z6 = false;
        if (i2 <= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10907yF1.b(z2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i2 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C10907yF1.b(z3, "start should be < than charSequence length");
        if (i3 <= charSequence.length()) {
            z4 = true;
        } else {
            z4 = false;
        }
        C10907yF1.b(z4, "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                z6 = this.h;
            }
            z5 = z6;
        } else {
            z5 = true;
        }
        return this.e.h(charSequence, i2, i3, i4, z5);
    }

    public void B(g gVar) {
        C10907yF1.m(gVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(gVar);
                this.a.writeLock().unlock();
            }
            this.d.post(new h(gVar, this.c));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void F(g gVar) {
        C10907yF1.m(gVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(gVar);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void G(EditorInfo editorInfo) {
        if (s() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.e.i(editorInfo);
        }
    }

    public String d() {
        C10907yF1.o(s(), "Not initialized yet");
        return this.e.a();
    }

    public int e(CharSequence charSequence, int i2) {
        return this.e.b(charSequence, i2);
    }

    public int f(CharSequence charSequence, int i2) {
        C10907yF1.o(s(), "Not initialized yet");
        C10907yF1.m(charSequence, "sequence cannot be null");
        return this.e.c(charSequence, i2);
    }

    public int g() {
        return this.l;
    }

    public int h(CharSequence charSequence, int i2) {
        return this.e.d(charSequence, i2);
    }

    public int i() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    @Deprecated
    public boolean l(CharSequence charSequence) {
        C10907yF1.o(s(), "Not initialized yet");
        C10907yF1.m(charSequence, "sequence cannot be null");
        return this.e.e(charSequence);
    }

    @Deprecated
    public boolean m(CharSequence charSequence, int i2) {
        C10907yF1.o(s(), "Not initialized yet");
        C10907yF1.m(charSequence, "sequence cannot be null");
        return this.e.f(charSequence, i2);
    }

    public boolean r() {
        return this.k;
    }

    public final boolean s() {
        if (i() == 1) {
            return true;
        }
        return false;
    }

    public void t() {
        boolean z2 = true;
        if (this.m != 1) {
            z2 = false;
        }
        C10907yF1.o(z2, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (s()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.e.g();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void u() {
        this.a.writeLock().lock();
        try {
            if (this.m == 0) {
                this.c = 0;
            }
            this.a.writeLock().unlock();
            if (i() == 0) {
                this.e.g();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void v(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new h(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public void w() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new h(arrayList, this.c));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence x(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return y(charSequence, 0, length);
    }

    public CharSequence y(CharSequence charSequence, int i2, int i3) {
        return z(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    public CharSequence z(CharSequence charSequence, int i2, int i3, int i4) {
        return A(charSequence, i2, i3, i4, 0);
    }
}
