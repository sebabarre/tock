package fr.vsct.tock.bot.admin.bot

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import org.litote.jackson.JacksonModuleServiceLoader

class StoryDefinitionConfiguration_Serializer : StdSerializer<StoryDefinitionConfiguration>(StoryDefinitionConfiguration::class.java),
        JacksonModuleServiceLoader {
    override fun module() = SimpleModule().addSerializer(this)

    override fun serialize(
            value: StoryDefinitionConfiguration,
            gen: JsonGenerator,
            serializers: SerializerProvider
    ) {
        gen.writeStartObject()
        gen.writeFieldName("storyId")
        val _storyId_ = value.storyId
        gen.writeString(_storyId_)
        gen.writeFieldName("botId")
        val _botId_ = value.botId
        gen.writeString(_botId_)
        gen.writeFieldName("intent")
        val _intent_ = value.intent
        serializers.defaultSerializeValue(_intent_, gen)
        gen.writeFieldName("currentType")
        val _currentType_ = value.currentType
        serializers.defaultSerializeValue(_currentType_, gen)
        gen.writeFieldName("answers")
        val _answers_ = value.answers
        serializers.defaultSerializeValue(_answers_, gen)
        gen.writeFieldName("version")
        val _version_ = value.version
        gen.writeNumber(_version_)
        gen.writeFieldName("_id")
        val __id_ = value._id
        serializers.defaultSerializeValue(__id_, gen)
        gen.writeEndObject()
    }
}
