package o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;

/* loaded from: classes4.dex */
public enum FN1 {
    READ_ONLY("r", 1),
    READ_WRITE(c1, 2),
    READ_WRITE_SYNC_ALL(e1, 4),
    READ_WRITE_SYNC_CONTENT(d1, 3);
    
    public static final String b1 = "r";
    public static final String c1 = "rw";
    public static final String d1 = "rwd";
    public static final String e1 = "rws";
    public final int X;
    public final String Y;

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            StandardOpenOption[] values;
            StandardOpenOption standardOpenOption;
            int ordinal;
            StandardOpenOption standardOpenOption2;
            int ordinal2;
            StandardOpenOption standardOpenOption3;
            int ordinal3;
            values = StandardOpenOption.values();
            int[] iArr = new int[values.length];
            a = iArr;
            try {
                standardOpenOption3 = StandardOpenOption.WRITE;
                ordinal3 = standardOpenOption3.ordinal();
                iArr[ordinal3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                standardOpenOption2 = StandardOpenOption.DSYNC;
                ordinal2 = standardOpenOption2.ordinal();
                iArr2[ordinal2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                standardOpenOption = StandardOpenOption.SYNC;
                ordinal = standardOpenOption.ordinal();
                iArr3[ordinal] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    FN1(String str, int i) {
        this.Y = str;
        this.X = i;
    }

    public static FN1 q(OpenOption... openOptionArr) {
        int ordinal;
        FN1 fn1;
        FN1 fn12 = READ_ONLY;
        for (OpenOption openOption : openOptionArr) {
            if (C11182zN1.a(openOption)) {
                int[] iArr = a.a;
                ordinal = AN1.a(openOption).ordinal();
                int i = iArr[ordinal];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            fn1 = READ_WRITE_SYNC_ALL;
                            if (fn12.o(fn1)) {
                            }
                            fn12 = fn1;
                        }
                    } else {
                        fn1 = READ_WRITE_SYNC_CONTENT;
                        if (fn12.o(fn1)) {
                        }
                        fn12 = fn1;
                    }
                } else {
                    fn1 = READ_WRITE;
                    if (fn12.o(fn1)) {
                    }
                    fn12 = fn1;
                }
            }
        }
        return fn12;
    }

    public static FN1 r(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 114:
                if (str.equals("r")) {
                    c = 0;
                    break;
                }
                break;
            case 3653:
                if (str.equals(c1)) {
                    c = 1;
                    break;
                }
                break;
            case 113343:
                if (str.equals(d1)) {
                    c = 2;
                    break;
                }
                break;
            case 113358:
                if (str.equals(e1)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return READ_ONLY;
            case 1:
                return READ_WRITE;
            case 2:
                return READ_WRITE_SYNC_CONTENT;
            case 3:
                return READ_WRITE_SYNC_ALL;
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public void g(Path path, EJ0<RandomAccessFile> ej0) throws IOException {
        RandomAccessFile l = l(path);
        try {
            ej0.accept(l);
            if (l != null) {
                l.close();
            }
        } catch (Throwable th) {
            if (l != null) {
                try {
                    l.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public <T> T h(Path path, RJ0<RandomAccessFile, T> rj0) throws IOException {
        RandomAccessFile l = l(path);
        try {
            T apply = rj0.apply(l);
            if (l != null) {
                l.close();
            }
            return apply;
        } catch (Throwable th) {
            if (l != null) {
                try {
                    l.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public RandomAccessFile i(File file) throws FileNotFoundException {
        return new C8487oK0(file, this.Y);
    }

    public RandomAccessFile j(String str) throws FileNotFoundException {
        return new C8487oK0(str, this.Y);
    }

    public RandomAccessFile l(Path path) throws FileNotFoundException {
        File file;
        file = path.toFile();
        Objects.requireNonNull(file, "file");
        return i(file);
    }

    public final int m() {
        return this.X;
    }

    public String n() {
        return this.Y;
    }

    public boolean o(FN1 fn1) {
        if (m() >= fn1.m()) {
            return true;
        }
        return false;
    }

    public C8487oK0 p(String str) throws FileNotFoundException {
        return new C8487oK0(str, this.Y);
    }
}
