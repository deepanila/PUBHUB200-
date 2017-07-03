package com.bookshopping.converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=true)

public class LocalDateTimeAttribute implements AttributeConverter<LocalDateTime,Timestamp> {
	@Override
	public Timestamp  convertToDatabaseColumn(LocalDateTime locdatetime )
	{
		return (locdatetime ==null ? null : Timestamp.valueOf(locdatetime));
		
	}
	@Override
	public LocalDateTime convertToEntityAttribute(Timestamp sqltimestamp)
	{
		return (sqltimestamp==null ? null :sqltimestamp.toLocalDateTime());
	}

}
