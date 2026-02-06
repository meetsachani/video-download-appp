package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import o.C6562gT0;
import o.C9604su1;
import o.C9847tu1;
import o.InterfaceC7058iW0;
import o.InterfaceC7072ia2;
import o.J82;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface FileSystem {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    @InterfaceC7058iW0
    @NotNull
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* loaded from: classes4.dex */
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            @NotNull
            public J82 appendingSink(@NotNull File file) throws FileNotFoundException {
                C6562gT0.p(file, "file");
                try {
                    return C9604su1.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return C9604su1.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(@NotNull File file) throws IOException {
                C6562gT0.p(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(@NotNull File file) throws IOException {
                C6562gT0.p(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            C6562gT0.o(file2, "file");
                            deleteContents(file2);
                        }
                        if (!file2.delete()) {
                            throw new IOException("failed to delete " + file2);
                        }
                    }
                    return;
                }
                throw new IOException("not a readable directory: " + file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(@NotNull File file) {
                C6562gT0.p(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(@NotNull File file, @NotNull File file2) throws IOException {
                C6562gT0.p(file, "from");
                C6562gT0.p(file2, "to");
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            @NotNull
            public J82 sink(@NotNull File file) throws FileNotFoundException {
                J82 q;
                J82 q2;
                C6562gT0.p(file, "file");
                try {
                    q2 = C9847tu1.q(file, false, 1, null);
                    return q2;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    q = C9847tu1.q(file, false, 1, null);
                    return q;
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(@NotNull File file) {
                C6562gT0.p(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            @NotNull
            public InterfaceC7072ia2 source(@NotNull File file) throws FileNotFoundException {
                C6562gT0.p(file, "file");
                return C9604su1.t(file);
            }

            @NotNull
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    @NotNull
    J82 appendingSink(@NotNull File file) throws FileNotFoundException;

    void delete(@NotNull File file) throws IOException;

    void deleteContents(@NotNull File file) throws IOException;

    boolean exists(@NotNull File file);

    void rename(@NotNull File file, @NotNull File file2) throws IOException;

    @NotNull
    J82 sink(@NotNull File file) throws FileNotFoundException;

    long size(@NotNull File file);

    @NotNull
    InterfaceC7072ia2 source(@NotNull File file) throws FileNotFoundException;
}
