package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.c;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import o.C7139ir2;
import o.C8238nJ;
import o.C8312nd;
import o.InterfaceC10494wZ;
import o.KZ0;
import o.MP0;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements MP0<Boolean> {
    public static final long a = 500;
    public static final String b = "EmojiCompatInitializer";

    /* loaded from: classes.dex */
    public static class a extends c.d {
        public a(Context context) {
            super(new b(context));
            f(1);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c.j {
        public final Context a;

        /* loaded from: classes.dex */
        public class a extends c.k {
            public final /* synthetic */ c.k a;
            public final /* synthetic */ ThreadPoolExecutor b;

            public a(c.k kVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = kVar;
                this.b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.k
            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.k
            public void b(f fVar) {
                try {
                    this.a.b(fVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.j
        public void a(final c.k kVar) {
            final ThreadPoolExecutor c = C8238nJ.c(EmojiCompatInitializer.b);
            c.execute(new Runnable() { // from class: o.za0
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.c(kVar, c);
                }
            });
        }

        public void c(c.k kVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                e a2 = androidx.emoji2.text.a.a(this.a);
                if (a2 != null) {
                    a2.m(threadPoolExecutor);
                    a2.a().a(new a(kVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                kVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                C7139ir2.b("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.q()) {
                    androidx.emoji2.text.c.c().t();
                }
            } finally {
                C7139ir2.d();
            }
        }
    }

    @Override // o.MP0
    /* renamed from: a */
    public Boolean create(Context context) {
        androidx.emoji2.text.c.p(new a(context));
        b(context);
        return Boolean.TRUE;
    }

    public void b(Context context) {
        final androidx.lifecycle.f b2 = ((KZ0) C8312nd.e(context).f(ProcessLifecycleInitializer.class)).b();
        b2.a(new InterfaceC10494wZ() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // o.InterfaceC10494wZ
            public void onResume(KZ0 kz0) {
                EmojiCompatInitializer.this.c();
                b2.d(this);
            }
        });
    }

    public void c() {
        C8238nJ.d().postDelayed(new c(), 500L);
    }

    @Override // o.MP0
    public List<Class<? extends MP0<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
