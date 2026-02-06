package o;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.util.Objects;

/* loaded from: classes4.dex */
public class T30 implements DirectoryStream.Filter<Path> {
    public final InterfaceC6430fz1 a;

    public T30(InterfaceC6430fz1 interfaceC6430fz1) {
        Objects.requireNonNull(interfaceC6430fz1, "pathFilter");
        this.a = interfaceC6430fz1;
    }

    public boolean a(Path path) throws IOException {
        FileVisitResult fileVisitResult;
        FileVisitResult a = this.a.a(path, C11130zA1.E0(path, C11130zA1.g));
        fileVisitResult = FileVisitResult.CONTINUE;
        if (a == fileVisitResult) {
            return true;
        }
        return false;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    public /* bridge */ /* synthetic */ boolean accept(Path path) throws IOException {
        return a(N30.a(path));
    }

    public InterfaceC6430fz1 b() {
        return this.a;
    }
}
