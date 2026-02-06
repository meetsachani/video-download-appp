package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes2.dex */
public abstract class zzfql extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfql(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, zzfqn zzfqnVar) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, i);
        zzfqh.a();
    }
}
