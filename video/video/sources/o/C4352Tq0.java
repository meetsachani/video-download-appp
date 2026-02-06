package o;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Tq0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4352Tq0 extends SimpleFileVisitor<Path> {
    @Nullable
    public final VA0<Path, BasicFileAttributes, FileVisitResult> X;
    @Nullable
    public final VA0<Path, BasicFileAttributes, FileVisitResult> Y;
    @Nullable
    public final VA0<Path, IOException, FileVisitResult> Y0;
    @Nullable
    public final VA0<Path, IOException, FileVisitResult> Z;

    /* JADX WARN: Multi-variable type inference failed */
    public C4352Tq0(@Nullable VA0<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> va0, @Nullable VA0<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> va02, @Nullable VA0<? super Path, ? super IOException, ? extends FileVisitResult> va03, @Nullable VA0<? super Path, ? super IOException, ? extends FileVisitResult> va04) {
        this.X = va0;
        this.Y = va02;
        this.Z = va03;
        this.Y0 = va04;
    }

    @NotNull
    public FileVisitResult a(@NotNull Path path, @Nullable IOException iOException) {
        FileVisitResult a;
        C6562gT0.p(path, "dir");
        VA0<Path, IOException, FileVisitResult> va0 = this.Y0;
        if (va0 != null && (a = C4255Sq0.a(va0.i(path, iOException))) != null) {
            return a;
        }
        FileVisitResult postVisitDirectory = super.postVisitDirectory(path, iOException);
        C6562gT0.o(postVisitDirectory, "postVisitDirectory(...)");
        return postVisitDirectory;
    }

    @NotNull
    public FileVisitResult b(@NotNull Path path, @NotNull BasicFileAttributes basicFileAttributes) {
        FileVisitResult a;
        C6562gT0.p(path, "dir");
        C6562gT0.p(basicFileAttributes, "attrs");
        VA0<Path, BasicFileAttributes, FileVisitResult> va0 = this.X;
        if (va0 != null && (a = C4255Sq0.a(va0.i(path, basicFileAttributes))) != null) {
            return a;
        }
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        C6562gT0.o(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    @NotNull
    public FileVisitResult c(@NotNull Path path, @NotNull BasicFileAttributes basicFileAttributes) {
        FileVisitResult a;
        C6562gT0.p(path, "file");
        C6562gT0.p(basicFileAttributes, "attrs");
        VA0<Path, BasicFileAttributes, FileVisitResult> va0 = this.Y;
        if (va0 != null && (a = C4255Sq0.a(va0.i(path, basicFileAttributes))) != null) {
            return a;
        }
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        C6562gT0.o(visitFile, "visitFile(...)");
        return visitFile;
    }

    @NotNull
    public FileVisitResult d(@NotNull Path path, @NotNull IOException iOException) {
        FileVisitResult a;
        C6562gT0.p(path, "file");
        C6562gT0.p(iOException, "exc");
        VA0<Path, IOException, FileVisitResult> va0 = this.Z;
        if (va0 != null && (a = C4255Sq0.a(va0.i(path, iOException))) != null) {
            return a;
        }
        FileVisitResult visitFileFailed = super.visitFileFailed(path, iOException);
        C6562gT0.o(visitFileFailed, "visitFileFailed(...)");
        return visitFileFailed;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return a(N30.a(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(N30.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return c(N30.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return d(N30.a(obj), iOException);
    }
}
