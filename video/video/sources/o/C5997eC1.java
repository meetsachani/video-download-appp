package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1253:1\n1#2:1254\n1869#3,2:1255\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n440#1:1255,2\n*E\n"})
/* renamed from: o.eC1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5997eC1 extends C9673tB1 {
    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path A0(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createTempDirectory;
        C6562gT0.p(fileAttributeArr, "attributes");
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C6562gT0.o(createTempDirectory, "createTempDirectory(...)");
        return createTempDirectory;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Map<String, Object> A1(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        Map<String, Object> readAttributes;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(str, "attributes");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        readAttributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        C6562gT0.o(readAttributes, "readAttributes(...)");
        return readAttributes;
    }

    @NotNull
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path B0(@Nullable Path path, @Nullable String str, @NotNull FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createTempDirectory;
        Path createTempDirectory2;
        C6562gT0.p(fileAttributeArr, "attributes");
        if (path != null) {
            createTempDirectory2 = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            C6562gT0.o(createTempDirectory2, "createTempDirectory(...)");
            return createTempDirectory2;
        }
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C6562gT0.o(createTempDirectory, "createTempDirectory(...)");
        return createTempDirectory;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path B1(Path path) throws IOException {
        Path readSymbolicLink;
        C6562gT0.p(path, "<this>");
        readSymbolicLink = Files.readSymbolicLink(path);
        C6562gT0.o(readSymbolicLink, "readSymbolicLink(...)");
        return readSymbolicLink;
    }

    public static /* synthetic */ Path C0(String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        Path createTempDirectory;
        if ((i & 1) != 0) {
            str = null;
        }
        C6562gT0.p(fileAttributeArr, "attributes");
        createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C6562gT0.o(createTempDirectory, "createTempDirectory(...)");
        return createTempDirectory;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    @NotNull
    public static final Path C1(@NotNull Path path, @NotNull Path path2) {
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, C5445bv2.X);
        try {
            return C2808Dz1.a.a(path, path2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e);
        }
    }

    public static /* synthetic */ Path D0(Path path, String str, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        return B0(path, str, fileAttributeArr);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    @Nullable
    public static final Path D1(@NotNull Path path, @NotNull Path path2) {
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, C5445bv2.X);
        try {
            return C2808Dz1.a.a(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path E0(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createTempFile;
        C6562gT0.p(fileAttributeArr, "attributes");
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C6562gT0.o(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    @NotNull
    public static final Path E1(@NotNull Path path, @NotNull Path path2) {
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, C5445bv2.X);
        Path D1 = D1(path, path2);
        if (D1 == null) {
            return path;
        }
        return D1;
    }

    @NotNull
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path F0(@Nullable Path path, @Nullable String str, @Nullable String str2, @NotNull FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createTempFile;
        Path createTempFile2;
        C6562gT0.p(fileAttributeArr, "attributes");
        if (path != null) {
            createTempFile2 = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            C6562gT0.o(createTempFile2, "createTempFile(...)");
            return createTempFile2;
        }
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C6562gT0.o(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path F1(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        Path attribute;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(str, "attribute");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        C6562gT0.o(attribute, "setAttribute(...)");
        return attribute;
    }

    public static /* synthetic */ Path G0(String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        Path createTempFile;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        C6562gT0.p(fileAttributeArr, "attributes");
        createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C6562gT0.o(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path G1(Path path, FileTime fileTime) throws IOException {
        Path lastModifiedTime;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(fileTime, "value");
        lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        C6562gT0.o(lastModifiedTime, "setLastModifiedTime(...)");
        return lastModifiedTime;
    }

    public static /* synthetic */ Path H0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return F0(path, str, str2, fileAttributeArr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path H1(Path path, UserPrincipal userPrincipal) throws IOException {
        Path owner;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(userPrincipal, "value");
        owner = Files.setOwner(path, userPrincipal);
        C6562gT0.o(owner, "setOwner(...)");
        return owner;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final void I0(Path path) throws IOException {
        C6562gT0.p(path, "<this>");
        Files.delete(path);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path I1(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        Path posixFilePermissions;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(set, "value");
        posixFilePermissions = Files.setPosixFilePermissions(path, set);
        C6562gT0.o(posixFilePermissions, "setPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean J0(Path path) throws IOException {
        boolean deleteIfExists;
        C6562gT0.p(path, "<this>");
        deleteIfExists = Files.deleteIfExists(path);
        return deleteIfExists;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path J1(URI uri) {
        Path path;
        C6562gT0.p(uri, "<this>");
        path = Paths.get(uri);
        C6562gT0.o(path, "get(...)");
        return path;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path K0(Path path, String str) {
        Path resolve;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(str, "other");
        resolve = path.resolve(str);
        C6562gT0.o(resolve, "resolve(...)");
        return resolve;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final <T> T K1(Path path, String str, HA0<? super B02<? extends Path>, ? extends T> ha0) throws IOException {
        DirectoryStream newDirectoryStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(str, "glob");
        C6562gT0.p(ha0, "block");
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream a = C6734hB1.a(newDirectoryStream);
            C6562gT0.m(a);
            T invoke = ha0.invoke(C10662xF.C1(a));
            UP0.d(1);
            C5033aE.a(newDirectoryStream, null);
            UP0.c(1);
            return invoke;
        } finally {
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path L0(Path path, Path path2) {
        Path resolve;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "other");
        resolve = path.resolve(path2);
        C6562gT0.o(resolve, "resolve(...)");
        return resolve;
    }

    public static /* synthetic */ Object L1(Path path, String str, HA0 ha0, int i, Object obj) throws IOException {
        DirectoryStream newDirectoryStream;
        if ((i & 1) != 0) {
            str = "*";
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(str, "glob");
        C6562gT0.p(ha0, "block");
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream a = C6734hB1.a(newDirectoryStream);
            C6562gT0.m(a);
            Object invoke = ha0.invoke(C10662xF.C1(a));
            UP0.d(1);
            C5033aE.a(newDirectoryStream, null);
            UP0.c(1);
            return invoke;
        } finally {
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean M0(Path path, LinkOption... linkOptionArr) {
        boolean exists;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        exists = Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return exists;
    }

    @InterfaceC6480g82(version = "2.1")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final void M1(@NotNull Path path, int i, boolean z, @NotNull HA0<? super InterfaceC4058Qq0, C7458kA2> ha0) {
        C6562gT0.p(path, "<this>");
        C6562gT0.p(ha0, "builderAction");
        N1(path, S0(ha0), i, z);
    }

    @HK1
    @NotNull
    public static final Void N0(@NotNull Path path, @NotNull Class<?> cls) {
        C6562gT0.p(path, "path");
        C6562gT0.p(cls, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + cls + " is not available for the file " + path + '.');
    }

    @InterfaceC6480g82(version = "2.1")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final void N1(@NotNull Path path, @NotNull FileVisitor<Path> fileVisitor, int i, boolean z) {
        Set k;
        FileVisitOption fileVisitOption;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(fileVisitor, "visitor");
        if (z) {
            fileVisitOption = FileVisitOption.FOLLOW_LINKS;
            k = A22.f(fileVisitOption);
        } else {
            k = B22.k();
        }
        Files.walkFileTree(path, k, i, fileVisitor);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final /* synthetic */ <V extends FileAttributeView> V O0(Path path, LinkOption... linkOptionArr) {
        FileAttributeView fileAttributeView;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        C6562gT0.y(4, C2638Cg0.X4);
        fileAttributeView = Files.getFileAttributeView(path, C5755dC1.a(), (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (fileAttributeView != null) {
            return (V) C10648xB1.a(fileAttributeView);
        }
        C6562gT0.y(4, C2638Cg0.X4);
        N0(path, C5755dC1.a());
        throw new SX0();
    }

    public static /* synthetic */ void O1(Path path, int i, boolean z, HA0 ha0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        M1(path, i, z, ha0);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final /* synthetic */ <V extends FileAttributeView> V P0(Path path, LinkOption... linkOptionArr) {
        FileAttributeView fileAttributeView;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        C6562gT0.y(4, C2638Cg0.X4);
        fileAttributeView = Files.getFileAttributeView(path, C5755dC1.a(), (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return (V) fileAttributeView;
    }

    public static /* synthetic */ void P1(Path path, FileVisitor fileVisitor, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        N1(path, fileVisitor, i, z);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final long Q0(Path path) throws IOException {
        long size;
        C6562gT0.p(path, "<this>");
        size = Files.size(path);
        return size;
    }

    @InterfaceC6480g82(version = "2.1")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    @NotNull
    public static final B02<Path> Q1(@NotNull Path path, @NotNull DA1... da1Arr) {
        C6562gT0.p(path, "<this>");
        C6562gT0.p(da1Arr, C9998uW1.m0);
        return new C3309Iz1(path, da1Arr);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final FileStore R0(Path path) throws IOException {
        FileStore fileStore;
        C6562gT0.p(path, "<this>");
        fileStore = Files.getFileStore(path);
        C6562gT0.o(fileStore, "getFileStore(...)");
        return fileStore;
    }

    @InterfaceC6480g82(version = "2.1")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    @NotNull
    public static final FileVisitor<Path> S0(@NotNull HA0<? super InterfaceC4058Qq0, C7458kA2> ha0) {
        C6562gT0.p(ha0, "builderAction");
        C4155Rq0 c4155Rq0 = new C4155Rq0();
        ha0.invoke(c4155Rq0);
        return c4155Rq0.e();
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final void T0(Path path, String str, HA0<? super Path, C7458kA2> ha0) throws IOException {
        DirectoryStream newDirectoryStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(str, "glob");
        C6562gT0.p(ha0, "action");
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream<? super Path> a = C6734hB1.a(newDirectoryStream);
            C6562gT0.m(a);
            for (Object obj : a) {
                ha0.invoke(obj);
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            UP0.d(1);
            C5033aE.a(newDirectoryStream, null);
            UP0.c(1);
        } finally {
        }
    }

    public static /* synthetic */ void U0(Path path, String str, HA0 ha0, int i, Object obj) throws IOException {
        DirectoryStream newDirectoryStream;
        if ((i & 1) != 0) {
            str = "*";
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(str, "glob");
        C6562gT0.p(ha0, "action");
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream<Object> a = C6734hB1.a(newDirectoryStream);
            C6562gT0.m(a);
            for (Object obj2 : a) {
                ha0.invoke(obj2);
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            UP0.d(1);
            C5033aE.a(newDirectoryStream, null);
            UP0.c(1);
        } finally {
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Object V0(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        Object attribute;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(str, "attribute");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        attribute = Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return attribute;
    }

    @NotNull
    public static final String W0(@NotNull Path path) {
        Path fileName;
        String obj;
        String N5;
        C6562gT0.p(path, "<this>");
        fileName = path.getFileName();
        if (fileName == null || (obj = fileName.toString()) == null || (N5 = C10763xf2.N5(obj, '.', "")) == null) {
            return "";
        }
        return N5;
    }

    public static final String Y0(Path path) {
        C6562gT0.p(path, "<this>");
        return a1(path);
    }

    @NotNull
    public static final String a1(@NotNull Path path) {
        FileSystem fileSystem;
        String separator;
        C6562gT0.p(path, "<this>");
        fileSystem = path.getFileSystem();
        separator = fileSystem.getSeparator();
        if (!C6562gT0.g(separator, RemoteSettings.i)) {
            String obj = path.toString();
            C6562gT0.m(separator);
            return C9545sf2.z2(obj, separator, RemoteSettings.i, false, 4, null);
        }
        return path.toString();
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final FileTime c1(Path path, LinkOption... linkOptionArr) throws IOException {
        FileTime lastModifiedTime;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        C6562gT0.o(lastModifiedTime, "getLastModifiedTime(...)");
        return lastModifiedTime;
    }

    @NotNull
    public static final String d1(@NotNull Path path) {
        Path fileName;
        String str;
        C6562gT0.p(path, "<this>");
        fileName = path.getFileName();
        if (fileName != null) {
            str = fileName.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public static final String f1(@NotNull Path path) {
        Path fileName;
        String obj;
        String Y5;
        C6562gT0.p(path, "<this>");
        fileName = path.getFileName();
        if (fileName != null && (obj = fileName.toString()) != null && (Y5 = C10763xf2.Y5(obj, UE.h, null, 2, null)) != null) {
            return Y5;
        }
        return "";
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final UserPrincipal h1(Path path, LinkOption... linkOptionArr) throws IOException {
        UserPrincipal owner;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        owner = Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return owner;
    }

    public static final String i1(Path path) {
        C6562gT0.p(path, "<this>");
        return path.toString();
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Set<PosixFilePermission> k1(Path path, LinkOption... linkOptionArr) throws IOException {
        Set<PosixFilePermission> posixFilePermissions;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        C6562gT0.o(posixFilePermissions, "getPosixFilePermissions(...)");
        return posixFilePermissions;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean l1(Path path, LinkOption... linkOptionArr) {
        boolean isDirectory;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return isDirectory;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean m1(Path path) {
        boolean isExecutable;
        C6562gT0.p(path, "<this>");
        isExecutable = Files.isExecutable(path);
        return isExecutable;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path n0(String str) {
        Path path;
        C6562gT0.p(str, "path");
        path = Paths.get(str, new String[0]);
        C6562gT0.o(path, "get(...)");
        return path;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean n1(Path path) throws IOException {
        boolean isHidden;
        C6562gT0.p(path, "<this>");
        isHidden = Files.isHidden(path);
        return isHidden;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path o0(String str, String... strArr) {
        Path path;
        C6562gT0.p(str, C5445bv2.X);
        C6562gT0.p(strArr, "subpaths");
        path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        C6562gT0.o(path, "get(...)");
        return path;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean o1(Path path) {
        boolean isReadable;
        C6562gT0.p(path, "<this>");
        isReadable = Files.isReadable(path);
        return isReadable;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path p0(Path path) {
        Path absolutePath;
        C6562gT0.p(path, "<this>");
        absolutePath = path.toAbsolutePath();
        C6562gT0.o(absolutePath, "toAbsolutePath(...)");
        return absolutePath;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean p1(Path path, LinkOption... linkOptionArr) {
        boolean isRegularFile;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        isRegularFile = Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return isRegularFile;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final String q0(Path path) {
        Path absolutePath;
        C6562gT0.p(path, "<this>");
        absolutePath = path.toAbsolutePath();
        return absolutePath.toString();
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean q1(Path path, Path path2) throws IOException {
        boolean isSameFile;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "other");
        isSameFile = Files.isSameFile(path, path2);
        return isSameFile;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path r0(Path path, Path path2, boolean z) throws IOException {
        CopyOption[] copyOptionArr;
        Path copy;
        StandardCopyOption standardCopyOption;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        if (z) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C6562gT0.o(copy, "copy(...)");
        return copy;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean r1(Path path) {
        boolean isSymbolicLink;
        C6562gT0.p(path, "<this>");
        isSymbolicLink = Files.isSymbolicLink(path);
        return isSymbolicLink;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path s0(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path copy;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        C6562gT0.p(copyOptionArr, C9998uW1.m0);
        copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C6562gT0.o(copy, "copy(...)");
        return copy;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean s1(Path path) {
        boolean isWritable;
        C6562gT0.p(path, "<this>");
        isWritable = Files.isWritable(path);
        return isWritable;
    }

    public static /* synthetic */ Path t0(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        CopyOption[] copyOptionArr;
        Path copy;
        StandardCopyOption standardCopyOption;
        if ((i & 2) != 0) {
            z = false;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        if (z) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C6562gT0.o(copy, "copy(...)");
        return copy;
    }

    @NotNull
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final List<Path> t1(@NotNull Path path, @NotNull String str) throws IOException {
        DirectoryStream newDirectoryStream;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(str, "glob");
        newDirectoryStream = Files.newDirectoryStream(path, str);
        try {
            DirectoryStream a = C6734hB1.a(newDirectoryStream);
            C6562gT0.m(a);
            List<Path> Y5 = C10662xF.Y5(a);
            C5033aE.a(newDirectoryStream, null);
            return Y5;
        } finally {
        }
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path u0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createDirectories;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(fileAttributeArr, "attributes");
        createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C6562gT0.o(createDirectories, "createDirectories(...)");
        return createDirectories;
    }

    public static /* synthetic */ List u1(Path path, String str, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            str = "*";
        }
        return t1(path, str);
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path v0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createDirectory;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(fileAttributeArr, "attributes");
        createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C6562gT0.o(createDirectory, "createDirectory(...)");
        return createDirectory;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path v1(Path path, Path path2, boolean z) throws IOException {
        CopyOption[] copyOptionArr;
        Path move;
        StandardCopyOption standardCopyOption;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        if (z) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C6562gT0.o(move, "move(...)");
        return move;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path w0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createFile;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(fileAttributeArr, "attributes");
        createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C6562gT0.o(createFile, "createFile(...)");
        return createFile;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path w1(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        Path move;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        C6562gT0.p(copyOptionArr, C9998uW1.m0);
        move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C6562gT0.o(move, "move(...)");
        return move;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path x0(Path path, Path path2) throws IOException {
        Path createLink;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        createLink = Files.createLink(path, path2);
        C6562gT0.o(createLink, "createLink(...)");
        return createLink;
    }

    public static /* synthetic */ Path x1(Path path, Path path2, boolean z, int i, Object obj) throws IOException {
        CopyOption[] copyOptionArr;
        Path move;
        StandardCopyOption standardCopyOption;
        if ((i & 2) != 0) {
            z = false;
        }
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        if (z) {
            standardCopyOption = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArr = new CopyOption[]{standardCopyOption};
        } else {
            copyOptionArr = new CopyOption[0];
        }
        move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        C6562gT0.o(move, "move(...)");
        return move;
    }

    @InterfaceC6480g82(version = "1.9")
    @NotNull
    public static final Path y0(@NotNull Path path, @NotNull FileAttribute<?>... fileAttributeArr) throws IOException {
        Path parent;
        boolean isDirectory;
        boolean isDirectory2;
        Path createDirectories;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(fileAttributeArr, "attributes");
        parent = path.getParent();
        if (parent != null) {
            isDirectory = Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
            if (!isDirectory) {
                try {
                    FileAttribute[] fileAttributeArr2 = (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length);
                    createDirectories = Files.createDirectories(parent, (FileAttribute[]) Arrays.copyOf(fileAttributeArr2, fileAttributeArr2.length));
                    C6562gT0.o(createDirectories, "createDirectories(...)");
                    return path;
                } catch (FileAlreadyExistsException e) {
                    isDirectory2 = Files.isDirectory(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
                    if (!isDirectory2) {
                        throw e;
                    }
                }
            }
        }
        return path;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final boolean y1(Path path, LinkOption... linkOptionArr) {
        boolean notExists;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        notExists = Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        return notExists;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final Path z0(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        Path createSymbolicLink;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(path2, "target");
        C6562gT0.p(fileAttributeArr, "attributes");
        createSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        C6562gT0.o(createSymbolicLink, "createSymbolicLink(...)");
        return createSymbolicLink;
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static final /* synthetic */ <A extends BasicFileAttributes> A z1(Path path, LinkOption... linkOptionArr) throws IOException {
        BasicFileAttributes readAttributes;
        C6562gT0.p(path, "<this>");
        C6562gT0.p(linkOptionArr, C9998uW1.m0);
        C6562gT0.y(4, C2638Cg0.W4);
        readAttributes = Files.readAttributes(path, C3407Jz1.a(), (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        C6562gT0.o(readAttributes, "readAttributes(...)");
        return (A) C9916uB1.a(readAttributes);
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static /* synthetic */ void X0(Path path) {
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @IR1(expression = "invariantSeparatorsPathString", imports = {}))
    @InterfaceC4611Wi0
    @XP0
    @InterfaceC6480g82(version = "1.4")
    public static /* synthetic */ void Z0(Path path) {
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static /* synthetic */ void b1(Path path) {
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static /* synthetic */ void e1(Path path) {
    }

    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static /* synthetic */ void g1(Path path) {
    }

    @XP0
    @InterfaceC6480g82(version = "1.5")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4611Wi0.class})
    public static /* synthetic */ void j1(Path path) {
    }
}
