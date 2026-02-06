package o;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* renamed from: o.Wo0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4635Wo0 {
    public ReferenceQueue<Object> a = new ReferenceQueue<>();
    public final Collection<b> b = Collections.synchronizedSet(new HashSet());
    public final List<String> c = Collections.synchronizedList(new ArrayList());
    public volatile boolean d;
    public Thread e;

    /* renamed from: o.Wo0$a */
    /* loaded from: classes4.dex */
    public final class a extends Thread {
        public a() {
            super("File Reaper");
            setPriority(10);
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                if (C4635Wo0.this.d && C4635Wo0.this.b.isEmpty()) {
                    return;
                }
                try {
                    b bVar = (b) C4635Wo0.this.a.remove();
                    C4635Wo0.this.b.remove(bVar);
                    if (!bVar.a()) {
                        C4635Wo0.this.c.add(bVar.b());
                    }
                    bVar.clear();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: o.Wo0$b */
    /* loaded from: classes4.dex */
    public static final class b extends PhantomReference<Object> {
        public final String a;
        public final C5176ap0 b;

        public b(String str, C5176ap0 c5176ap0, Object obj, ReferenceQueue<? super Object> referenceQueue) {
            super(obj, referenceQueue);
            this.a = str;
            this.b = c5176ap0 == null ? C5176ap0.b : c5176ap0;
        }

        public boolean a() {
            return this.b.b(new File(this.a));
        }

        public String b() {
            return this.a;
        }
    }

    public final synchronized void a(String str, Object obj, C5176ap0 c5176ap0) {
        try {
            if (!this.d) {
                if (this.e == null) {
                    a aVar = new a();
                    this.e = aVar;
                    aVar.start();
                }
                this.b.add(new b(str, c5176ap0, obj, this.a));
            } else {
                throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        this.d = true;
        Thread thread = this.e;
        if (thread != null) {
            synchronized (thread) {
                this.e.interrupt();
            }
        }
    }

    public List<String> c() {
        return new ArrayList(this.c);
    }

    public int d() {
        return this.b.size();
    }

    public void e(File file, Object obj) {
        f(file, obj, null);
    }

    public void f(File file, Object obj, C5176ap0 c5176ap0) {
        Objects.requireNonNull(file, "file");
        a(file.getPath(), obj, c5176ap0);
    }

    public void g(String str, Object obj) {
        h(str, obj, null);
    }

    public void h(String str, Object obj, C5176ap0 c5176ap0) {
        Objects.requireNonNull(str, "path");
        a(str, obj, c5176ap0);
    }

    public void i(Path path, Object obj) {
        j(path, obj, null);
    }

    public void j(Path path, Object obj, C5176ap0 c5176ap0) {
        Path absolutePath;
        String path2;
        Objects.requireNonNull(path, "file");
        absolutePath = path.toAbsolutePath();
        path2 = absolutePath.toString();
        a(path2, obj, c5176ap0);
    }
}
