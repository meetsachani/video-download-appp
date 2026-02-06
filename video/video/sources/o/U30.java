package o;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Deprecated
/* loaded from: classes4.dex */
public abstract class U30<T> {
    public final FileFilter a;
    public final int b;

    /* loaded from: classes4.dex */
    public static class a extends IOException {
        private static final long serialVersionUID = 1347339620135041008L;
        public final File X;
        public final int Y;

        public a(File file, int i) {
            this("Operation Cancelled", file, i);
        }

        public int a() {
            return this.Y;
        }

        public File b() {
            return this.X;
        }

        public a(String str, File file, int i) {
            super(str);
            this.X = file;
            this.Y = i;
        }
    }

    public U30() {
        this(null, -1);
    }

    public final void a(File file, int i, Collection<T> collection) throws IOException {
        if (!i(file, i, collection)) {
            return;
        }
        throw new a(file, i);
    }

    public boolean d(File file, int i, Collection<T> collection) throws IOException {
        return true;
    }

    public boolean i(File file, int i, Collection<T> collection) throws IOException {
        return false;
    }

    public final void l(File file, int i, Collection<T> collection) throws IOException {
        a(file, i, collection);
        if (d(file, i, collection)) {
            f(file, i, collection);
            int i2 = i + 1;
            int i3 = this.b;
            if (i3 < 0 || i2 <= i3) {
                a(file, i, collection);
                File[] b = b(file, i, file.listFiles(this.a));
                if (b == null) {
                    j(file, i2, collection);
                } else {
                    for (File file2 : b) {
                        if (file2.isDirectory()) {
                            l(file2, i2, collection);
                        } else {
                            a(file2, i2, collection);
                            h(file2, i2, collection);
                            a(file2, i2, collection);
                        }
                    }
                }
            }
            e(file, i, collection);
        }
        a(file, i, collection);
    }

    public final void m(File file, Collection<T> collection) throws IOException {
        Objects.requireNonNull(file, "startDirectory");
        try {
            k(file, collection);
            l(file, 0, collection);
            g(collection);
        } catch (a e) {
            c(file, collection, e);
        }
    }

    public U30(FileFilter fileFilter, int i) {
        this.a = fileFilter;
        this.b = i;
    }

    public U30(HJ0 hj0, HJ0 hj02, int i) {
        if (hj0 == null && hj02 == null) {
            this.a = null;
        } else {
            this.a = C8605op0.z(hj0 == null ? Cu2.Y : hj0).d(C8605op0.A(hj02 == null ? Cu2.Y : hj02));
        }
        this.b = i;
    }

    public void g(Collection<T> collection) throws IOException {
    }

    public void k(File file, Collection<T> collection) throws IOException {
    }

    public File[] b(File file, int i, File... fileArr) throws IOException {
        return fileArr;
    }

    public void c(File file, Collection<T> collection, a aVar) throws IOException {
        throw aVar;
    }

    public void e(File file, int i, Collection<T> collection) throws IOException {
    }

    public void f(File file, int i, Collection<T> collection) throws IOException {
    }

    public void h(File file, int i, Collection<T> collection) throws IOException {
    }

    public void j(File file, int i, Collection<T> collection) throws IOException {
    }
}
