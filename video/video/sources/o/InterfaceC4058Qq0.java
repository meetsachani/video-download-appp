package o;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import org.jetbrains.annotations.NotNull;

@InterfaceC6480g82(version = "2.1")
@InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
/* renamed from: o.Qq0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4058Qq0 {
    void a(@NotNull VA0<? super Path, ? super IOException, ? extends FileVisitResult> va0);

    void b(@NotNull VA0<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> va0);

    void c(@NotNull VA0<? super Path, ? super IOException, ? extends FileVisitResult> va0);

    void d(@NotNull VA0<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> va0);
}
