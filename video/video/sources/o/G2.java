package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/* loaded from: classes4.dex */
public abstract class G2<T extends Properties> {
    public abstract T a();

    public T b(File file) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            T c = c(fileInputStream);
            fileInputStream.close();
            return c;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public T c(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        T a = a();
        a.load(inputStream);
        return a;
    }

    public T d(Reader reader) throws IOException {
        T a = a();
        a.load(reader);
        return a;
    }

    public T e(ClassLoader classLoader, String str) throws IOException {
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        try {
            T c = c(resourceAsStream);
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return c;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public T f(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            T c = c(fileInputStream);
            fileInputStream.close();
            return c;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public T g(URI uri) throws IOException {
        Path path;
        path = Paths.get(uri);
        return i(path);
    }

    public T h(URL url) throws IOException {
        InputStream openStream = url.openStream();
        try {
            T c = c(openStream);
            if (openStream != null) {
                openStream.close();
            }
            return c;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openStream != null) {
                    try {
                        openStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public T i(Path path) throws IOException {
        InputStream newInputStream;
        newInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            T c = c(newInputStream);
            if (newInputStream != null) {
                newInputStream.close();
            }
            return c;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (newInputStream != null) {
                    try {
                        newInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}
