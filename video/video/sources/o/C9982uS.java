package o;

import android.database.Cursor;
import android.database.MatrixCursor;

/* renamed from: o.uS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9982uS {
    public static Cursor a(Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    int type = cursor.getType(i);
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type == 4) {
                                        objArr[i] = cursor.getBlob(i);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    objArr[i] = cursor.getString(i);
                                }
                            } else {
                                objArr[i] = Double.valueOf(cursor.getDouble(i));
                            }
                        } else {
                            objArr[i] = Long.valueOf(cursor.getLong(i));
                        }
                    } else {
                        objArr[i] = null;
                    }
                }
                matrixCursor.addRow(objArr);
            }
            cursor.close();
            return matrixCursor;
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    public static int b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndex("`" + str + "`");
    }

    public static int c(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}
