package o;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

@InterfaceC4611Wi0
/* renamed from: o.xY  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10734xY implements KP {
    @NotNull
    public static final C10734xY a = new C10734xY();

    @Override // o.KP
    @NotNull
    public LP a(@NotNull Path path, @NotNull Path path2, boolean z) {
        boolean isDirectory;
        Path copy;
        LinkOption linkOption;
        boolean isDirectory2;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        LinkOption[] a2 = C11090z01.a.a(z);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a2, a2.length);
        isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (isDirectory) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            isDirectory2 = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (isDirectory2) {
                C7458kA2 c7458kA2 = C7458kA2.a;
                return LP.X;
            }
        }
        CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(a2, a2.length);
        copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C6562gT0.o(copy, "copy(...)");
        return LP.X;
    }
}
