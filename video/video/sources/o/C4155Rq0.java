package o;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Rq0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4155Rq0 implements InterfaceC4058Qq0 {
    @Nullable
    public VA0<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> a;
    @Nullable
    public VA0<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> b;
    @Nullable
    public VA0<? super Path, ? super IOException, ? extends FileVisitResult> c;
    @Nullable
    public VA0<? super Path, ? super IOException, ? extends FileVisitResult> d;
    public boolean e;

    @Override // o.InterfaceC4058Qq0
    public void a(@NotNull VA0<? super Path, ? super IOException, ? extends FileVisitResult> va0) {
        C6562gT0.p(va0, "function");
        f();
        g(this.d, "onPostVisitDirectory");
        this.d = va0;
    }

    @Override // o.InterfaceC4058Qq0
    public void b(@NotNull VA0<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> va0) {
        C6562gT0.p(va0, "function");
        f();
        g(this.b, "onVisitFile");
        this.b = va0;
    }

    @Override // o.InterfaceC4058Qq0
    public void c(@NotNull VA0<? super Path, ? super IOException, ? extends FileVisitResult> va0) {
        C6562gT0.p(va0, "function");
        f();
        g(this.c, "onVisitFileFailed");
        this.c = va0;
    }

    @Override // o.InterfaceC4058Qq0
    public void d(@NotNull VA0<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> va0) {
        C6562gT0.p(va0, "function");
        f();
        g(this.a, "onPreVisitDirectory");
        this.a = va0;
    }

    @NotNull
    public final FileVisitor<Path> e() {
        f();
        this.e = true;
        return O30.a(new C4352Tq0(this.a, this.b, this.c, this.d));
    }

    public final void f() {
        if (!this.e) {
            return;
        }
        throw new IllegalStateException("This builder was already built");
    }

    public final void g(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }
}
