package o;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class M0 implements Comparator<File> {
    public List<File> a(List<File> list) {
        if (list != null) {
            list.sort(this);
        }
        return list;
    }

    public File[] b(File... fileArr) {
        if (fileArr != null) {
            Arrays.sort(fileArr, this);
        }
        return fileArr;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
