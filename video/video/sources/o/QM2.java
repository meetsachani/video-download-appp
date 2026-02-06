package o;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class QM2 {
    public static final String b = "androidx.work.workdb";
    public static final String a = AbstractC6949i41.f("WrkDbPathHelper");
    public static final String[] c = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        return c(context, b);
    }

    public static File b(Context context) {
        return context.getDatabasePath(b);
    }

    public static File c(Context context, String filePath) {
        return new File(context.getNoBackupFilesDir(), filePath);
    }

    public static String d() {
        return b;
    }

    public static void e(Context context) {
        String format;
        if (b(context).exists()) {
            AbstractC6949i41.c().a(a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f = f(context);
            for (File file : f.keySet()) {
                File file2 = f.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        AbstractC6949i41.c().h(a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    if (file.renameTo(file2)) {
                        format = String.format("Migrated %s to %s", file, file2);
                    } else {
                        format = String.format("Renaming %s to %s failed", file, file2);
                    }
                    AbstractC6949i41.c().a(a, format, new Throwable[0]);
                }
            }
        }
    }

    public static Map<File, File> f(Context context) {
        File b2;
        File a2;
        String[] strArr;
        HashMap hashMap = new HashMap();
        hashMap.put(b(context), a(context));
        for (String str : c) {
            hashMap.put(new File(b2.getPath() + str), new File(a2.getPath() + str));
        }
        return hashMap;
    }
}
