package com.templates.moonwolf125.androidkotlinarchitecturetemplates.data.event

import com.templates.moonwolf125.androidkotlinarchitecturetemplates.data.model.TempModel

// TODO do I need this in the future if I move over to callbacks using function types?
class TempEvent : BaseEvent<TempModel, Error>()