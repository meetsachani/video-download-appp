package o;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import o.HQ;
import o.NQ;

/* loaded from: classes4.dex */
public class N4 extends NQ {
    public final List<Path> b1;
    public final List<Path> c1;

    /* loaded from: classes4.dex */
    public static class b extends NQ.a<N4, b> {
        @Override // o.XK0
        /* renamed from: o */
        public N4 get() {
            return new N4(this);
        }
    }

    public static b r() {
        return new b();
    }

    public static N4 w() {
        return r().n(HQ.b()).get();
    }

    public static N4 x(InterfaceC6430fz1 interfaceC6430fz1, InterfaceC6430fz1 interfaceC6430fz12) {
        return r().n(HQ.b()).m(interfaceC6430fz1).k(interfaceC6430fz12).get();
    }

    public static N4 y() {
        return r().n(HQ.d()).get();
    }

    public static N4 z(InterfaceC6430fz1 interfaceC6430fz1, InterfaceC6430fz1 interfaceC6430fz12) {
        return r().n(HQ.d()).m(interfaceC6430fz1).k(interfaceC6430fz12).get();
    }

    @Override // o.NQ
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof N4)) {
            return false;
        }
        N4 n4 = (N4) obj;
        if (Objects.equals(this.b1, n4.b1) && Objects.equals(this.c1, n4.c1)) {
            return true;
        }
        return false;
    }

    @Override // o.NQ
    public int hashCode() {
        return (super.hashCode() * 31) + Objects.hash(this.b1, this.c1);
    }

    @Override // o.NQ
    public void l(Path path, IOException iOException) {
        super.l(path, iOException);
        q(this.b1, path);
    }

    @Override // o.NQ
    public void m(Path path, BasicFileAttributes basicFileAttributes) {
        super.m(path, basicFileAttributes);
        q(this.c1, path);
    }

    public final void q(List<Path> list, Path path) {
        Path normalize;
        normalize = path.normalize();
        list.add(normalize);
    }

    public List<Path> s() {
        return new ArrayList(this.b1);
    }

    public List<Path> t() {
        return new ArrayList(this.c1);
    }

    public List<Path> u(Path path, boolean z, Comparator<? super Path> comparator) {
        return C11130zA1.L0(s(), path, z, comparator);
    }

    public List<Path> v(Path path, boolean z, Comparator<? super Path> comparator) {
        return C11130zA1.L0(t(), path, z, comparator);
    }

    @Deprecated
    public N4() {
        super(HQ.f());
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
    }

    public N4(b bVar) {
        super(bVar);
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
    }

    @Deprecated
    public N4(HQ.j jVar) {
        super(jVar);
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
    }

    @Deprecated
    public N4(HQ.j jVar, InterfaceC6430fz1 interfaceC6430fz1, InterfaceC6430fz1 interfaceC6430fz12) {
        super(jVar, interfaceC6430fz1, interfaceC6430fz12);
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
    }

    @Deprecated
    public N4(HQ.j jVar, InterfaceC6430fz1 interfaceC6430fz1, InterfaceC6430fz1 interfaceC6430fz12, InterfaceC8483oJ0<Path, IOException, FileVisitResult> interfaceC8483oJ0) {
        super(jVar, interfaceC6430fz1, interfaceC6430fz12, interfaceC8483oJ0);
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
    }
}
