package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import o.C4972Zy1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nNioSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioSystemFileSystem.kt\nokio/NioSystemFileSystem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
/* renamed from: o.tq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9831tq1 extends C10240vW0 {
    @Override // o.C10240vW0, o.AbstractC2576Bp0
    @Nullable
    public C9340rp0 E(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "path");
        return Q(c4972Zy1.H());
    }

    @Nullable
    public final C9340rp0 Q(@NotNull Path path) {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        boolean isSymbolicLink;
        Path path2;
        boolean isRegularFile;
        boolean isDirectory;
        C4972Zy1 c4972Zy1;
        long size;
        FileTime creationTime;
        Long l;
        FileTime lastModifiedTime;
        Long l2;
        FileTime lastAccessTime;
        C6562gT0.p(path, "nioPath");
        Long l3 = null;
        try {
            Class a = C3407Jz1.a();
            linkOption = LinkOption.NOFOLLOW_LINKS;
            readAttributes = Files.readAttributes(path, a, linkOption);
            isSymbolicLink = readAttributes.isSymbolicLink();
            if (isSymbolicLink) {
                path2 = Files.readSymbolicLink(path);
            } else {
                path2 = null;
            }
            isRegularFile = readAttributes.isRegularFile();
            isDirectory = readAttributes.isDirectory();
            if (path2 != null) {
                c4972Zy1 = C4972Zy1.a.i(C4972Zy1.Y, path2, false, 1, null);
            } else {
                c4972Zy1 = null;
            }
            size = readAttributes.size();
            Long valueOf = Long.valueOf(size);
            creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l = R(creationTime);
            } else {
                l = null;
            }
            lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l2 = R(lastModifiedTime);
            } else {
                l2 = null;
            }
            lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l3 = R(lastAccessTime);
            }
            return new C9340rp0(isRegularFile, isDirectory, c4972Zy1, valueOf, l, l2, l3, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    public final Long R(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    public void g(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        try {
            Path H = c4972Zy1.H();
            Path H2 = c4972Zy12.H();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(H, H2, standardCopyOption, standardCopyOption2);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            message = e.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // o.C10240vW0, o.AbstractC2576Bp0
    public void p(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        Files.createSymbolicLink(c4972Zy1.H(), c4972Zy12.H(), new FileAttribute[0]);
    }

    @Override // o.C10240vW0
    @NotNull
    public String toString() {
        return "NioSystemFileSystem";
    }
}
