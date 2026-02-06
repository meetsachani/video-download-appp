package o;

import android.app.Activity;
import android.database.Cursor;
import android.provider.MediaStore;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class LG {
    public static String a(long j) {
        double d = j;
        double d2 = d / 1024.0d;
        double d3 = d2 / 1024.0d;
        double d4 = d3 / 1024.0d;
        double d5 = d4 / 1024.0d;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (d5 > 1.0d) {
            return decimalFormat.format(d5).concat(" TB");
        }
        if (d4 > 1.0d) {
            return decimalFormat.format(d4).concat(" GB");
        }
        if (d3 > 1.0d) {
            return decimalFormat.format(d3).concat(" MB");
        }
        if (d2 > 1.0d) {
            return decimalFormat.format(d2).concat(" KB");
        }
        return decimalFormat.format(d).concat(" Bytes");
    }

    public static ArrayList<ZF2> b(Activity activity) {
        ArrayList<ZF2> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        Cursor query = activity.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "bucket_display_name", "bucket_id", C7033iP1.m0}, null, null, "date_added DESC");
        if (query != null) {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_display_name");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("bucket_display_name");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow(C7033iP1.m0);
            while (query.moveToNext()) {
                query.getString(columnIndexOrThrow);
                String string = query.getString(columnIndexOrThrow2);
                String string2 = query.getString(columnIndexOrThrow3);
                if (string2 != null) {
                    String parent = new File(string2).getParent();
                    if (parent != null && !arrayList2.contains(parent)) {
                        arrayList2.add(parent);
                        ZF2 zf2 = new ZF2();
                        zf2.l(parent);
                        zf2.j(string);
                        zf2.h(string2);
                        zf2.a();
                        arrayList.add(zf2);
                    } else {
                        Iterator<ZF2> it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ZF2 next = it.next();
                                if (next.f().equals(parent)) {
                                    next.h(string2);
                                    next.a();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            query.close();
        }
        return arrayList;
    }

    public static ArrayList<File> c(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.getName().endsWith(".mp4") || file2.getName().endsWith(".gif")) {
                    if (!arrayList.contains(file2)) {
                        arrayList.add(file2);
                    }
                    if (!arrayList.contains(file2)) {
                        arrayList.add(file2);
                    }
                }
            }
        }
        return arrayList;
    }
}
