package o;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
/* loaded from: classes3.dex */
public final class Q30 extends SimpleFileVisitor<Path> {
    public final boolean X;
    @Nullable
    public C9381rz1 Y;
    @NotNull
    public C7085ie<C9381rz1> Z = new C7085ie<>();

    public Q30(boolean z) {
        this.X = z;
    }

    public final boolean a() {
        return this.X;
    }

    @NotNull
    public FileVisitResult b(@NotNull Path path, @NotNull BasicFileAttributes basicFileAttributes) {
        Object fileKey;
        C6562gT0.p(path, "dir");
        C6562gT0.p(basicFileAttributes, "attrs");
        fileKey = basicFileAttributes.fileKey();
        this.Z.add(new C9381rz1(path, fileKey, this.Y));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        C6562gT0.o(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    @NotNull
    public final List<C9381rz1> c(@NotNull C9381rz1 c9381rz1) {
        C6562gT0.p(c9381rz1, "directoryNode");
        this.Y = c9381rz1;
        Files.walkFileTree(c9381rz1.d(), C11090z01.a.b(this.X), 1, O30.a(this));
        this.Z.removeFirst();
        C7085ie<C9381rz1> c7085ie = this.Z;
        this.Z = new C7085ie<>();
        return c7085ie;
    }

    @NotNull
    public FileVisitResult d(@NotNull Path path, @NotNull BasicFileAttributes basicFileAttributes) {
        C6562gT0.p(path, "file");
        C6562gT0.p(basicFileAttributes, "attrs");
        this.Z.add(new C9381rz1(path, null, this.Y));
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        C6562gT0.o(visitFile, "visitFile(...)");
        return visitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(N30.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return d(N30.a(obj), basicFileAttributes);
    }
}
