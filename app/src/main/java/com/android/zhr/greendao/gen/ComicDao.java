package com.android.zhr.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.android.zhhr.db.utils.StringConverter;
import java.util.List;

import com.android.zhhr.data.entity.Comic;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COMIC".
*/
public class ComicDao extends AbstractDao<Comic, Long> {

    public static final String TABLENAME = "COMIC";

    /**
     * Properties of entity Comic.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Cover = new Property(2, String.class, "cover", false, "COVER");
        public final static Property Author = new Property(3, String.class, "author", false, "AUTHOR");
        public final static Property Chapters = new Property(4, String.class, "chapters", false, "CHAPTERS");
        public final static Property Tags = new Property(5, String.class, "tags", false, "TAGS");
        public final static Property Collections = new Property(6, String.class, "collections", false, "COLLECTIONS");
        public final static Property Describe = new Property(7, String.class, "describe", false, "DESCRIBE");
        public final static Property Point = new Property(8, String.class, "point", false, "POINT");
        public final static Property Popularity = new Property(9, String.class, "popularity", false, "POPULARITY");
        public final static Property Topics = new Property(10, String.class, "topics", false, "TOPICS");
        public final static Property Updates = new Property(11, String.class, "updates", false, "UPDATES");
        public final static Property Status = new Property(12, String.class, "status", false, "STATUS");
        public final static Property ReadType = new Property(13, int.class, "readType", false, "READ_TYPE");
        public final static Property CurrentChapter = new Property(14, int.class, "CurrentChapter", false, "CURRENT_CHAPTER");
    };

    private final StringConverter chaptersConverter = new StringConverter();
    private final StringConverter tagsConverter = new StringConverter();

    public ComicDao(DaoConfig config) {
        super(config);
    }
    
    public ComicDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COMIC\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"COVER\" TEXT," + // 2: cover
                "\"AUTHOR\" TEXT," + // 3: author
                "\"CHAPTERS\" TEXT," + // 4: chapters
                "\"TAGS\" TEXT," + // 5: tags
                "\"COLLECTIONS\" TEXT," + // 6: collections
                "\"DESCRIBE\" TEXT," + // 7: describe
                "\"POINT\" TEXT," + // 8: point
                "\"POPULARITY\" TEXT," + // 9: popularity
                "\"TOPICS\" TEXT," + // 10: topics
                "\"UPDATES\" TEXT," + // 11: updates
                "\"STATUS\" TEXT," + // 12: status
                "\"READ_TYPE\" INTEGER NOT NULL ," + // 13: readType
                "\"CURRENT_CHAPTER\" INTEGER NOT NULL );"); // 14: CurrentChapter
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COMIC\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Comic entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String cover = entity.getCover();
        if (cover != null) {
            stmt.bindString(3, cover);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        List chapters = entity.getChapters();
        if (chapters != null) {
            stmt.bindString(5, chaptersConverter.convertToDatabaseValue(chapters));
        }
 
        List tags = entity.getTags();
        if (tags != null) {
            stmt.bindString(6, tagsConverter.convertToDatabaseValue(tags));
        }
 
        String collections = entity.getCollections();
        if (collections != null) {
            stmt.bindString(7, collections);
        }
 
        String describe = entity.getDescribe();
        if (describe != null) {
            stmt.bindString(8, describe);
        }
 
        String point = entity.getPoint();
        if (point != null) {
            stmt.bindString(9, point);
        }
 
        String popularity = entity.getPopularity();
        if (popularity != null) {
            stmt.bindString(10, popularity);
        }
 
        String topics = entity.getTopics();
        if (topics != null) {
            stmt.bindString(11, topics);
        }
 
        String updates = entity.getUpdates();
        if (updates != null) {
            stmt.bindString(12, updates);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(13, status);
        }
        stmt.bindLong(14, entity.getReadType());
        stmt.bindLong(15, entity.getCurrentChapter());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Comic entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String cover = entity.getCover();
        if (cover != null) {
            stmt.bindString(3, cover);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(4, author);
        }
 
        List chapters = entity.getChapters();
        if (chapters != null) {
            stmt.bindString(5, chaptersConverter.convertToDatabaseValue(chapters));
        }
 
        List tags = entity.getTags();
        if (tags != null) {
            stmt.bindString(6, tagsConverter.convertToDatabaseValue(tags));
        }
 
        String collections = entity.getCollections();
        if (collections != null) {
            stmt.bindString(7, collections);
        }
 
        String describe = entity.getDescribe();
        if (describe != null) {
            stmt.bindString(8, describe);
        }
 
        String point = entity.getPoint();
        if (point != null) {
            stmt.bindString(9, point);
        }
 
        String popularity = entity.getPopularity();
        if (popularity != null) {
            stmt.bindString(10, popularity);
        }
 
        String topics = entity.getTopics();
        if (topics != null) {
            stmt.bindString(11, topics);
        }
 
        String updates = entity.getUpdates();
        if (updates != null) {
            stmt.bindString(12, updates);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(13, status);
        }
        stmt.bindLong(14, entity.getReadType());
        stmt.bindLong(15, entity.getCurrentChapter());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public Comic readEntity(Cursor cursor, int offset) {
        Comic entity = new Comic( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // cover
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // author
            cursor.isNull(offset + 4) ? null : chaptersConverter.convertToEntityProperty(cursor.getString(offset + 4)), // chapters
            cursor.isNull(offset + 5) ? null : tagsConverter.convertToEntityProperty(cursor.getString(offset + 5)), // tags
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // collections
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // describe
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // point
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // popularity
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // topics
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // updates
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // status
            cursor.getInt(offset + 13), // readType
            cursor.getInt(offset + 14) // CurrentChapter
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Comic entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCover(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setChapters(cursor.isNull(offset + 4) ? null : chaptersConverter.convertToEntityProperty(cursor.getString(offset + 4)));
        entity.setTags(cursor.isNull(offset + 5) ? null : tagsConverter.convertToEntityProperty(cursor.getString(offset + 5)));
        entity.setCollections(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDescribe(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPoint(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPopularity(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setTopics(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setUpdates(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setStatus(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setReadType(cursor.getInt(offset + 13));
        entity.setCurrentChapter(cursor.getInt(offset + 14));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Comic entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Comic entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
